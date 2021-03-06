package dataProvider;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import managers.FileReaderManager;
import testDataTypes.User;
	
	
public class JsonDataReader {
	private final String UserFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "User.json";
	
	public static List<User> userList;
	
	public JsonDataReader(){
		userList = getUserData();
					 
	}
	
		
	private List<User> getUserData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			
			bufferReader = new BufferedReader(new FileReader(UserFilePath));
			User[] users = gson.fromJson(bufferReader, User[].class);
			return Arrays.asList(users);
			
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + UserFilePath);
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}
		
	public final User getUserByName(String UserName){
		for(User user: userList) {
			System.out.println(user.FirstName);
			 if(user.FirstName.equalsIgnoreCase(UserName)) return user;
			 }
			 return null;
	}
	

}


