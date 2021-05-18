import pl.coderslab.entity.User;
import pl.coderslab.methods.BCrypt;
import pl.coderslab.methods.UserDao;

public class Main1 {

    public static void main(String[] args) {


       UserDao userDao = new UserDao();
        User user2;
       // user2.setPassword("1234");
      //  user2.setUsername("Jaco");

      // user2.setEmail("Kwachu@outlook.com");

        user2 = userDao.read(2);
        user2.setEmail("elo@elo2.pl");
        userDao.update(user2);



       User users[] = userDao.findAll();
       for(User user10 : users){
           System.out.println(user10.getId() +" "+user10.getUsername()+" "+user10.getEmail());
       }

    }


}
