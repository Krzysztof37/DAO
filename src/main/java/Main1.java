import pl.coderslab.entity.DBUtil;
import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main1 {

    public static void main(String[] args) {

        User user2 = new User(14,"darek@gmail.com.pl","Dareczek13","32154667");
        User user3 = new User(0,"Alek@wp.pl","ALi","iddqd");
        UserDao userDao = new UserDao();

        System.out.println(user2.getPassword());
        System.out.println(user2.getId()+" "+user2.getId()+" "+user3.getId());



        userDao.update(user2);





    }


}
