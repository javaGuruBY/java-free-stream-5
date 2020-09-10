package by.petranovski.task_5;

import by.petranovski.task_5.bean.User;
import by.petranovski.task_5.service.UserLoginService;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService myUserLoginService = new UserLoginService();
        User userOne = new User("Shell", "123");
        System.out.println(myUserLoginService.login(userOne, "123"));
        System.out.println(myUserLoginService.login(userOne, "321"));
        System.out.println(myUserLoginService.login(userOne, "321"));
        System.out.println(myUserLoginService.login(userOne, "321"));
        System.out.println(myUserLoginService.login(userOne, "421"));

    }
}
