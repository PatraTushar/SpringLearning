package Annotations.com.Swiggy.Users;


import org.springframework.stereotype.Component;

@Component
public class UserService {


    public UserService(){

        System.out.println(" UserService Object is created ");
    }

    public void login() {
        System.out.println("User Logged In");
    }
}
