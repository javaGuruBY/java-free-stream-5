package by.jrr.free5stream.service;

import by.jrr.free5stream.bean.User;

public class UserLoginService {

    public boolean login(User user, String password) {
        if (checkIfPasswordMatchUserPassword(user, password)) {
            if (!isUserBlocked(user)) {
                dropLoginAttempLeft(user);
                return true;
            }
            return false;
        } else {
            decrementloginAttemptLeft(user);
            if(!ifLoginAttemptLeftIsLeft(user)) {
                blockUser(user);
            }
            return false;
        }
    }

    public boolean checkIfPasswordMatchUserPassword(User user, String password) {
        return user.password.equals(password);
    }
    public User dropLoginAttempLeft(User user) {
        user.loginAttemptLeft = 3;
        return user;
    }
    public boolean isUserBlocked(User user) {
        return user.isBlocked;
    }
    public User decrementloginAttemptLeft(User user) {
        user.loginAttemptLeft = user.loginAttemptLeft - 1;
        return user;
    }
    public User blockUser(User user) {
        user.isBlocked = true;
        return user;
    }
    public boolean ifLoginAttemptLeftIsLeft(User user) {
        return user.loginAttemptLeft > 0;
    }
}
