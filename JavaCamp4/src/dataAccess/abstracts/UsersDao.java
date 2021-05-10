package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Users;

public interface UsersDao {
	
 void add(Users user);
 void delete(Users user);
 List<String> getByMail();
 List<Users> getAll();
 
}
