package local.acids.factory;

import local.acids.model.Address;
import org.junit.Assert;
import org.junit.Test;

public class AddressFactoryTest {
    @Test
    public void testCreateAddress(){
        String address1 = "Short street8";
        String address2 = "";

        Address a = AddressFactory.getAddress(address1, address2);
        System.out.println(a);
        Assert.assertEquals(a.getAddress1(),address1);

    }
}
