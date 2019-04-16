package local.acids.factory;

import local.acids.model.Employee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {


    String firstName = "Siya";
    String lastName = "Dladla";

    @Test
    public void testCreateEmployee(){
        Employee e = EmployeeFactory.getEmployee(firstName, lastName);
        System.out.println(e);
        Assert.assertEquals(e.getFirstName(), firstName);
    }
}
