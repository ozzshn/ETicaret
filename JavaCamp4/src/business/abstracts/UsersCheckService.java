package business.abstracts;

public interface UsersCheckService {
	
	boolean checkEmail(String mail);
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkPassword(String password);
}
