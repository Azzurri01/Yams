package local.yams.factory;

import local.yams.model.Address;
import local.yams.model.Location;
import org.junit.*;

public class LocationFactoryTest {

    @Test
    public void testCreateLocation(){
        String name = "Room 11";

        String street = "Yellow brick rd";
        String city= "Cape Town";
        String state= "Western Cape";
        Address address = AddressFactory.getAddress(street, city, state);
        Location l = LocationFactory.getLocation(name, address);

        System.out.println(l);
        Assert.assertEquals(name, l.getName());
    }
}