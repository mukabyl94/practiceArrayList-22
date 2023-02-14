import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     User user = new User(8,"Tuno", 25);
     User user1 = new User(5,"Mika", 22);
     User user2 = new User(2,"Niko", 20);
     UserDao userDao = new UserDao();
     userDao.save(user);
     userDao.save(user1);
     userDao.save(user2);
        System.out.println(userDao.searchById(2));



    }
}