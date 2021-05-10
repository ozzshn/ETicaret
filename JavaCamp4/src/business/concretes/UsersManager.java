package business.concretes;

import business.abstracts.UsersCheckService;
import business.abstracts.UsersService;
import business.abstracts.UsersValidityService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.UsersDao;
import entities.concretes.Users;

public class UsersManager implements UsersService {
   
	UsersCheckService usersCheckService;
	UsersDao usersDao;
	LoggerService loggerService;
	
	
	public UsersManager(UsersCheckService usersCheckService, UsersDao usersDao, LoggerService loggerService) {
		super();
		this.usersCheckService = usersCheckService;
		this.usersDao = usersDao;
		this.loggerService = loggerService;
	}

	@Override
	public void register(Users user) {
	   UsersValidityService validityService= new UsersValidityManager(usersDao);
	   
	   if(validityService.isValidation(user.getEmail()) 
			   && usersCheckService.checkEmail(user.getEmail()) 
			   && usersCheckService.checkFirstName(user.getFirstName()) 
			   && usersCheckService.checkLastName(user.getLastName()) 
			   && usersCheckService.checkPassword(user.getPassword()))
			   {
		        usersDao.add(user);
		        loggerService.logToSystem();
		        System.out.println(user.getEmail()+  "adresine dogrulama gonderilmistir!!!");
		        System.out.println(user.getFirstName()+ " " + user.getLastName()+ "uyeliginiz basarili!!!!!!" );
		        
			   }
		
	}

	@Override
	public void signIn(String email, String password) {
		for (int i = 0; i < usersDao.getAll().size(); i++) {
            if (usersDao.getAll().get(i).getEmail().equals(email) &&
                    usersDao.getAll().get(i).getPassword().equals(password)) {
                System.out.println("Basariliiii!");
                return;
            }
        }
        System.out.println("Mail veya parola hataliii!");
		
	}

}
