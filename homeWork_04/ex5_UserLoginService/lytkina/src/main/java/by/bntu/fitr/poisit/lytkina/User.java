package by.bntu.fitr.poisit.lytkina;

public class User {
    String login;
    String password;
    boolean isBlocked;
    int loginAttempt;

    public User(){
        loginAttempt = 3;
    }

    public User(String login, String password, boolean isBlocked, int loginAttempt) {
        this.login = login;
        this.password = password;
        this.isBlocked = isBlocked;
        this.loginAttempt = loginAttempt;
    }

    public void resetLoginAttempt(){

    }
    public void blockUser(){

    }
}
