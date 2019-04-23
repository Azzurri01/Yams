package local.yams.factory;
import local.yams.model.Status;

import org.junit.Assert;
import org.junit.Test;

public class StatusFactoryTest {

    @Test
    public void testCreateStatus(){
        String name = "Available";

        Status s = StatusFactory.getStatus(name);
        System.out.println(s);
        Assert.assertEquals(s.getName(), name);
    }
}
