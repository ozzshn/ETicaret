package business.abstracts;

import entities.concretes.Users;

public interface UsersService {
 void register(Users user);
 void signIn(String email,String password);
}
