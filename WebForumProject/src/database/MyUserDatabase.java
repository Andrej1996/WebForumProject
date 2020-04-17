package database;

import entity.User;
import java.util.HashMap;
import java.util.Map;


public class MyUserDatabase {

    Map<String, User> userMap = new HashMap<>();

    static private MyUserDatabase instance = new MyUserDatabase();

    public static MyUserDatabase getInstance() {
        if(instance == null) {
            instance = new MyUserDatabase();
        }

        return instance;
    }

    /**
     * This metod add user in userMap
     */
    public void addUser(User user) {
        userMap.put(user.getEmail(),user);

    }


    /**
     * Getter method
     */
    public User getUser(String key) {
        return userMap.get(key);
    }

    public boolean containsUser(User user) {
        return userMap.containsKey(user.getEmail());
    }

    /**
     * This method remove user from userMap
     */
    public boolean removeUser(User user) {
        if (containsUser(user)) {
            userMap.remove(user.getEmail());
            return true;
        }
        return false;
    }

    /**
     * This method update user
     */
    public boolean updateUser(User user) {
        if (containsUser(user)) {
            userMap.replace(user.getEmail(),user);
            return true;
        }
        return false;
    }

    /**
     * This method add Topic with user ID, topic and message
     */
    public void addTopic(String userID, String topic, String message) {

    }
}
