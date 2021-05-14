import pl.coderslab.entity.DBUtil;
import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {


        UserDao userDao = new UserDao();
        User user2 = new User();
        user2.setUsername("Robert");
        user2.setEmail("Kwachu@outlook.com");
        user2.setPassword("1234567");




       User users[] = userDao.findAll();
       for(User user10 : users){
           System.out.println(user10.getId() +" "+user10.getUsername()+" "+user10.getEmail());
       }







    }


}
