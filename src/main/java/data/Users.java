package data;

import java.util.ArrayList;
import java.util.List;

public class Users {
   public List<User> users = new ArrayList<>();

    {
        User admin = new User("0000", "8520");


        users.add(admin);
    }

}
