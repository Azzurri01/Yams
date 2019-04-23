package local.yams.factory;

import local.yams.model.Address;
import local.yams.model.Contact;
import local.yams.model.Supplier;
import org.junit.Assert;
import org.junit.Test;

public class SupplierFactoryTest {

    @Test
    public void testCreateSupplier() {
        String name = "Takealot";

        String phoneNumber = "021 555 4495";
        String emailAddress = "info@takealot.com";
        Contact contact = ContactFactory.getContact(phoneNumber, emailAddress);

        String street = "Yellow brick rd";
        String city= "Cape Town";
        String state= "Western Cape";
        Address address = AddressFactory.getAddress(street, city, state);

        Supplier s = SupplierFactory.getSupplier(name, contact, address);
        System.out.println(s);
        Assert.assertEquals(s.getName(), name);
        Assert.assertEquals(s.getContact().getPhoneNumber(), phoneNumber);
    }
}
