package local.acids.factory;
import local.acids.model.Staff;

import org.junit.*;

public class StaffFactoryTest {

    @Test
    public void testCreateStaff(){
        String firstName = "Jonathan";
        String lastName = "Theron";
        String emailAddress = "jmtheron@gmail.com";

        Staff s = StaffFactory.getStaff(firstName, lastName, emailAddress);
        System.out.println(s);
        Assert.assertEquals(firstName, s.getFirstName());
    }
}