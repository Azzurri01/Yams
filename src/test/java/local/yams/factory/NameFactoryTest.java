package local.yams.factory;

import local.yams.model.Name;
import org.junit.*;

public class NameFactoryTest {
    @Test
    public void testCreateName() {
        String firstName = "Jonathan";
        String middleName = "Michael";
        String lastName = "Theron";

        Name n = NameFactory.getName(firstName, middleName, lastName);
        System.out.println(n);
        Assert.assertEquals(n.getFirstName(), firstName);
    }
}
