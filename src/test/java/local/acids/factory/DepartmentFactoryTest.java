package local.acids.factory;

import local.acids.model.Department;
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
