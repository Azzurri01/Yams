package local.yams.factory;

import local.yams.model.Address;
import org.junit.Assert;
import org.junit.Test;

public class AddressFactoryTest {
    @Test
    public void testCreateAddress(){
        String street = "Short street8";
        String city = "Cape Town";
        String state = "Western Cape";

        Address a = AddressFactory.getAddress(street, city, state);
        System.out.println(a);
        Assert.assertEquals(a.getCity(),city);
    }
}
