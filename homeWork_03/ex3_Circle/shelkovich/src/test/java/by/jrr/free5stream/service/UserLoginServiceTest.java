package by.jrr.free5stream.service;

import by.jrr.free5stream.bean.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {

    @Test
    public void loginTestshouldReturnTrue() {
        User user = new User();
        user.password = "1234";

        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.login(user, "1234");

        boolean expected = true;

        assertEquals(expected, actual);
    }
    @Test
    public void loginTestShouldReturnFalse() {
        User user = new User();
        user.password = "1234";

        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.login(user, "12345");

        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnTrue() {
        User user = new User();
        user.password = "1234";

        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.checkIfPasswordMatchUserPassword(user, "1234");

        boolean expected = true;

        assertEquals(expected, actual);
    }
    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnFalse() {
        User user = new User();
        user.password = "1234";

        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.checkIfPasswordMatchUserPassword(user, "12345");

        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void dropLoginAttempLeft() {
        User user = new User();
        user.loginAttemptLeft = 1;

        UserLoginService userLoginService = new UserLoginService();
        User updatedUser = userLoginService.dropLoginAttempLeft(user);

        int expected = 3;
        int actual = updatedUser.loginAttemptLeft;

        assertEquals(expected, actual);
    }

    @Test
    public void isUserBlockedShouldReturnTrue() {
        User user = new User();
        user.isBlocked = true;

        UserLoginService userLoginService = new UserLoginService();

        boolean expected = true;
        boolean actual = userLoginService.isUserBlocked(user);

        assertEquals(expected, actual);
    }
    @Test
    public void isUserBlockedShouldReturnfalse() {
        User user = new User();
        user.isBlocked = false;

        UserLoginService userLoginService = new UserLoginService();

        boolean expected = false;
        boolean actual = userLoginService.isUserBlocked(user);

        assertEquals(expected, actual);
    }

    @Test
    public void decrementloginAttemptLeft() {
        User user = new User();
        user.loginAttemptLeft = 3;

        UserLoginService userLoginService = new UserLoginService();

        int expected = 2;
        userLoginService.decrementloginAttemptLeft(user);
        int actual = user.loginAttemptLeft;

        assertEquals(expected, actual);
    }

    @Test
    public void blockUser() {
        User user = new User();
        user.isBlocked = false;

        UserLoginService userLoginService = new UserLoginService();

        boolean expected = true;
        userLoginService.blockUser(user);
        boolean actual = user.isBlocked;

        assertEquals(expected, actual);
    }

    @Test
    public void ifLoginAttemptLeftIsLeft() {
        User user = new User();
        user.loginAttemptLeft = 1;

        UserLoginService userLoginService = new UserLoginService();

        boolean expected = true;
        boolean actual = userLoginService.ifLoginAttemptLeftIsLeft(user);

        assertEquals(expected, actual);
    }

    @Test
    public void loginShouldBlockUser() {
        User user = new User();
        user.loginAttemptLeft = 1;
        user.password = "1234";
        user.isBlocked = false;

        UserLoginService userLoginService = new UserLoginService();

        userLoginService.login(user, "12345");
        boolean actual = user.isBlocked;
        boolean expected = true;

        assertEquals(expected, actual);
    }
    @Test
    public void loginShouldNotProceed() {
        User user = new User();
        user.loginAttemptLeft = 0;
        user.password = "1234";
        user.isBlocked = true;

        UserLoginService userLoginService = new UserLoginService();

        boolean actual = userLoginService.login(user, "1234");
        boolean expected = false;

        assertEquals(expected, actual);
    }
}
