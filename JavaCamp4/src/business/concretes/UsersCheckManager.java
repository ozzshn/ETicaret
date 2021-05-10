package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UsersCheckService;

public class UsersCheckManager implements UsersCheckService {

	@Override
	public boolean checkEmail(String mail) {
		  String regex = "^(.+)@(.+)$";
	      Pattern pattern = Pattern.compile(regex);
	      Matcher matcher = pattern.matcher(mail);
	        if (matcher.matches()) {
	            return true;
	        } else {
	            System.out.println("Geçersiz mail adresi girdiniz! Lütfen geçerli bir mail giriniz. Mail:" + mail);
	            return false;
	            }
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()>2)
			return true;
		else
		  System.out.println("isminiz 2 karakterden kisa olmamalidir!!");
		  return false;	
		
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()>2)
			return true;
		else
		  System.out.println("soyisminiz 2 karakterden kisa olmamalidir!!");
		  return false;
		  
	}

	@Override
	public boolean checkPassword(String password) {

		if(password.length()>6)
			return true;
		else
		  System.out.println("sifreniz 6 karakterden kisa olmamalidir!!");
		  return false;
		
		
		
	}

}
