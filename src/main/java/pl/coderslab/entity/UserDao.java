package pl.coderslab.entity;

import java.sql.*;

public class UserDao {

    private User user;

    public void create(User user){

        try(Connection conn = DBUtil.connect()){
            PreparedStatement preste = conn.prepareStatement("INSERT INTO users VALUES(null,?,?,?);", Statement.RETURN_GENERATED_KEYS);

            preste.setString(1,user.getEmail());
            preste.setString(2,user.getUsername());
            preste.setString(3,user.getPassword());
            preste.executeUpdate();
            ResultSet rs = preste.getGeneratedKeys();

            while(rs.next()){
                user.setId(rs.getInt(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }




    }
public User read(int id ){

        try(Connection conn = DBUtil.connect()){
            PreparedStatement preste = conn.prepareStatement("SELECT * FROM users WHERE id = ?;");
            preste.setInt(1,id);
            ResultSet rs = preste.executeQuery();
            if (rs.next()) {
                int id2 = rs.getInt("id");

                String email = rs.getString("email");
                String username = rs.getString("username");
                String password = rs.getString("password");
                User user = new User(id2,email,username,password);
                return user;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
}
public void update (User user){
        try(Connection conn = DBUtil.connect()){
            PreparedStatement preste = conn.prepareStatement("UPDATE users set email = ?, username = ?, password = ? WHERE id = ?;");
            preste.setString(1,user.getEmail());
            preste.setString(2,user.getUsername());
            preste.setString(3, user.getPassword());
            preste.setInt(4,user.getId());
            preste.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }



}
public void delete(int id){
        try(Connection conn = DBUtil.connect()){
            PreparedStatement preste = conn.prepareStatement("DELETE  FROM users where id = ?;");
            preste.setInt(1,id);
            preste.executeUpdate();


        }catch (SQLException e){
            e.printStackTrace();
        }
}

}
