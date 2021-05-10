package business.concretes;

import business.abstracts.UsersValidityService;
import dataAccess.abstracts.UsersDao;
import entities.concretes.Users;

public class UsersValidityManager implements UsersValidityService {

	private UsersDao usersDao;
	
	public UsersValidityManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}

	@Override
	public boolean isValidation(String mail) {
		for (Users user: usersDao.getAll()) {
            if(mail.equals(user.getEmail())) {
                System.out.println("Bu mail kullanildi!: " + mail);
                return false;
            }
        }
        return true;
	}
	
	
	}


