package local.acids.factory;

import local.acids.model.Customer;
import org.junit.Assert;
import org.junit.Test;

public class CustomerFactoryTest {
    @Test
    public void testCreateCustomer(){
        String firstName = "Henry";
        String lastName = "Smith";
        String email = "HenryS@domain.local";
        String cellPhoneNumber = "0831234455";

        Customer c = CustomerFactory.getCustomer(firstName, lastName, email, cellPhoneNumber);
        System.out.println(c);
        Assert.assertEquals(c.getEmail(), email);

    }
}
