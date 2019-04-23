package local.yams.factory;

import local.yams.model.User;
import org.junit.*;

public class UserFactoryTest {

    @Test
    public void testCreateUser(){
        String firstName = "Jonathan";
        String lastName = "Theron";
        String emailAddress = "jmtheron@gmail.com";

        User u = UserFactory.getUser(firstName, lastName, emailAddress);
        System.out.println(u);
        Assert.assertEquals(firstName, u.getFirstName());
    }
}
