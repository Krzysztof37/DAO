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

        User user = new User();
        user.setUsername("krzychu");
        user.setPassword("32167");
        user.setEmail("bla@bla.pl");
        User user2 = new User();
        user2.setEmail("elo@elo.pl");
        user2.setPassword("1234");
        user2.setUsername("jaco");
        UserDao userDao = new UserDao();
        User userT2 = userDao.read(2);
        userT2.setUsername("Olek");
        System.out.println(userT2.getId());
        userDao.update(userT2);


       User users[] = userDao.findAll();
       for(User user10 : users){
           System.out.println(user10.getId() +" "+user10.getUsername()+" "+user10.getEmail());
       }







    }


}
