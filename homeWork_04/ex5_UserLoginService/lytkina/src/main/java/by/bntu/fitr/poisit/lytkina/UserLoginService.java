package by.bntu.fitr.poisit.lytkina;

import java.util.Scanner;

public class UserLoginService {
    public boolean login(User user, String password){
        if (password.equals(user.password)){
            user.isBlocked = false;
            return true;
        }else {
            user.isBlocked = true;
            return false;
        }                
    }
}
