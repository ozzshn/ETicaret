
import business.concretes.UsersCheckManager;
import business.concretes.UsersManager;
import core.concretes.GLoggerManagerAdapter;
import dataAccess.concretes.HibernateUsersDao;
import entities.concretes.Users;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Users user1=new Users(1,"Rached","Ghezzal ","asistkrali@gmail.com ","1903058");
	
		UsersManager usersManager= new UsersManager(new UsersCheckManager(),new HibernateUsersDao(),new GLoggerManagerAdapter());
		
		Users user2=new Users(2,"Josef De","Souza ","defanskrali@gmail.com ","1234399");
		usersManager.register(user1);
		System.out.println("--------------------------");
        usersManager.register(user2);	
        System.out.println("--------------------------");
       
        Users user3=new Users(3,"Atiba"," Hutchinson ","defanskrali@gmail.com ","1369989"); //ayni email denemesi
        usersManager.register(user3);
        
        System.out.println("--------------------------");
        
        Users user4=new Users(4,"Valentine"," Rosier ","bekkrali@gmail.com ","1369");//password kontrolu
        usersManager.register(user4);
        
        System.out.println("--------------------------");
        
        Users user5=new Users(5,"Aboubakar","V","golkrali@gmail.com ","13689969");//karakter kontrolu
        usersManager.register(user5);
        
        
       
	}

}
