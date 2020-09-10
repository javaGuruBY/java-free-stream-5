package by.petranovski.task_5.service;

import by.petranovski.task_5.bean.User;

public class UserLoginService {
    public boolean login(User user, String password) {
        if (comparePasswords(user, password)) {
            if (!isUserBlocked(user)) {
                resetCountOfLoginAttempts(user);
                return true;
            }
            return false;
        } else {
            decrementCountOfLoginAttempts(user);
            if(!IsLoginAttemptsLeft(user)) {
                blockUser(user);
            }
            return false;
        }
    }

    public boolean comparePasswords(User user, String password) {
        return user.getPassword().equals(password);
    }

    public User blockUser(User user) {
        user.setBlocked(true);
        return user;
    }

    public User resetCountOfLoginAttempts(User user){
        user.setCountOfLoginAttempts(3);
        return user;
    }

    public boolean isUserBlocked(User user) {
        return user.isBlocked();
    }

    public User decrementCountOfLoginAttempts(User user) {
        user.setCountOfLoginAttempts(user.getCountOfLoginAttempts() - 1);
        return user;
    }

    public boolean IsLoginAttemptsLeft(User user) {
        return user.getCountOfLoginAttempts() > 0;
    }
}
