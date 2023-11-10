package data;

import java.util.ArrayList;
import java.util.List;

public class Users {
   public List<User> users = new ArrayList<>();

    {
        User admin = new User("0000", "8520");
        User asya = new User("89119714277","poops");


        users.add(admin);
        users.add(asya);
    }

}
