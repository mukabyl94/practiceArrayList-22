import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> users = new ArrayList<>();

    public void save(User user){
       users.add(user);
    }
    public User searchById(int id){
        for(User s: users){
            if (s.getId()==id){
                return s;
            }
        }
        return null;
    }
}
