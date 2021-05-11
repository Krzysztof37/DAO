import pl.coderslab.entity.DBUtil;
import pl.coderslab.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pomocnik {}
/*
    public void update (User user){
        try(Connection conn = DBUtil.connect()){

            PreparedStatement preste = conn.prepareStatement("SELECT * FROM users WHERE id = ?;");
            preste.setInt(1,user.getId());
            ResultSet rs = preste.executeQuery();
            if(rs.next()) {
                User usertest = new User(rs.getInt("id"), rs.getString("email"), rs.getString("username"), rs.getString("password"));
                if(!user.getEmail().equals(usertest.getEmail())){
                    PreparedStatement presteEmail = conn.prepareStatement("UPDATE users set email = ? WHERE id = ?;");
                    presteEmail.setString(1,user.getEmail());
                    presteEmail.setInt(2,user.getId());
                    presteEmail.executeUpdate();
                }
                if(!user.getUsername().equals(usertest.getUsername())){
                    PreparedStatement presteUserName = conn.prepareStatement("UPDATE users set username = ? WHERE id = ?;");
                    presteUserName.setString(1,user.getUsername());
                    presteUserName.setInt(2,user.getId());
                    presteUserName.executeUpdate();
                }
                if(user.getPassword().equals(usertest.getPassword())){
                    PreparedStatement prestePassword = conn.prepareStatement("UPDATE users set password = ? WHERE id = ?;");
                    prestePassword.setString(1,user.getPassword());
                    prestePassword.setInt(2,user.getId());
                    prestePassword.executeUpdate();
                }

            }
        }catch(SQLException e){
            e.printStackTrace();
        }



    }
}
*/