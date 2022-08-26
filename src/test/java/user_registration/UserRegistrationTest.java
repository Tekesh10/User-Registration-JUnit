package user_registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenCorrectDetailsReturnHappy() {
        UserRegistration validate = new UserRegistration();
        String result = validate.userRegistrationValidation("Aman","Khan","aman-khan@gmail.co1.in","91 1234567890","khanAman@1");
        Assert.assertEquals("Happy",result);
    }
    @Test
    public void givenIncorrectDetailsReturnSad() {
        UserRegistration validate = new UserRegistration();
        String result = validate.userRegistrationValidation("aman","khan","aman-Khan@gmail.co.in1","919087654321","Aman@1");
        Assert.assertEquals("Sad",result);
    }
}
