package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UsersDao;
import entities.concretes.Users;

public class HibernateUsersDao implements UsersDao {

  private ArrayList<String> emails=new ArrayList<String>();
  private ArrayList<Users> users=new ArrayList<Users>();
  
	
	@Override
	public void add(Users user) {
	  emails.add(user.getEmail());
	  users.add(user);
	  System.out.println(user.getFirstName()+ " " +user.getLastName()+" hibernate ile sisteme eklenmistir.");
		
	}

	@Override
	public void delete(Users user) {
	  System.out.println(user.getFirstName()+ " " +user.getLastName()+" hibernate ile sistemden silinmistir.");
		
	}

	@Override
	public List<String> getByMail() {
	   return emails;
	}

	@Override
	public List<Users> getAll() {
		return users;
	}

	
}
