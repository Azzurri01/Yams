package local.acids.factory;
import local.acids.model.Staff;

import org.junit.*;

public class StaffFactoryTest {

    @Test
    public void testCreateStaff(){
        Staff s = new Staff();
        Assert.assertNotNull(s);
    }
}