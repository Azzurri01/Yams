package local.yams.factory;

import local.yams.model.Department;
import org.junit.Assert;
import org.junit.Test;

public class DepartmentFactoryTest {
    @Test
    public void testCreateDepartment(){
        String name = "Sales";

        Department d = DepartmentFactory.getDepartment(name);
        System.out.println(d);
        Assert.assertEquals(d.getName(), name);
    }
}
