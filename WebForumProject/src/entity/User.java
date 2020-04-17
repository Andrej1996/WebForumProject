package entity;


import java.sql.Date;


public class User {
    public static final String USER_KEY = "USER";
    private String username;
    private String email;
    private String password;
    private String gender;
    private int age;
    public Date dataCreated;
    public Date dataManipulated;
    public String currentStatus;
    public String registeredStatus;


    /**
     * User Constructor
     */
    public User(String username, String email, String password, String gender, String string, int age,
                String currentStatus, String registeredStatus) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.currentStatus = currentStatus;
        this.registeredStatus = registeredStatus;
    }

    /**
     * Default Constructor
     */
    public User() {

    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("username ='").append(username).append('\'');
        sb.append("email ='").append(email).append('\'');
        sb.append("password ='").append(password).append('\'');
        sb.append("gender ='").append(gender).append('\'');
        sb.append("age ='").append(age).append('\'');
        sb.append("data created ='").append(dataCreated).append('\'');
        sb.append("data manufactured ='").append(dataManipulated).append('\'');
        sb.append("current status ='").append(currentStatus).append('\'');
        sb.append("registered status ='").append(registeredStatus).append('\'');
        sb.append("}");
        return sb.toString();
    }


    /**
     * Getter and Setter
     */
    public static String getUserKey() {
        return USER_KEY;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Date dataCreated) {
        this.dataCreated = dataCreated;
    }

    public Date getDataManipulated() {
        return dataManipulated;
    }

    public void setDataManipulated(Date dataManipulated) {
        this.dataManipulated = dataManipulated;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getRegisteredStatus() {
        return registeredStatus;
    }

    public void setRegisteredStatus(String registeredStatus) {
        this.registeredStatus = registeredStatus;
    }

    public void setInfo(UserInfo info) {

    }
}
