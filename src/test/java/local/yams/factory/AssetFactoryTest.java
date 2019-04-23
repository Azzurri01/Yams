package local.yams.factory;

import local.yams.model.*;
import org.junit.*;

public class AssetFactoryTest {
    @Test
    public void testCreateAsset(){
        String name = "Monitor";
        String assetTag = "J0001";
        String notes = "Just some random note";
        String serial = "007";

        String street = "Yellow brick rd";
        String city= "Cape Town";
        String state= "Western Cape";
        Address address = AddressFactory.getAddress(street, city, state);
        Location location = LocationFactory.getLocation(name, address);

        String supplier_name = "Takealot";
        String supplier_phoneNumber = "021 555 4495";
        String supplier_emailAddress = "info@takealot.com";
        Contact supplier_contact = ContactFactory.getContact(supplier_phoneNumber, supplier_emailAddress);

        String supplier_street = "Yellow brick rd";
        String supplier_city= "Cape Town";
        String supplier_state= "Western Cape";
        Address supplier_address = AddressFactory.getAddress(supplier_street, supplier_city, supplier_state);
        Supplier takealot = SupplierFactory.getSupplier(supplier_name, supplier_contact, supplier_address);

        Asset a = AssetFactory.getAsset(name, assetTag, notes, serial, location, takealot);
        System.out.println(a);
        Assert.assertEquals(serial, a.getSerial());
    }
}