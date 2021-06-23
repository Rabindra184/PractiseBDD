package testDataTypes;

public class User {

	public String FirstName;
	public String LastName;
	public String UserName;
	public String Password;

	
	@Override
    public String toString() {
        return "User [firstName=" + FirstName + ", lastName=" + LastName + ", userName=" + UserName + " ]";
    }
	
	
	}


