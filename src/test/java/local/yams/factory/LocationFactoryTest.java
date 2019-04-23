package local.yams.factory;

import local.yams.model.Address;
import local.yams.model.Location;
import org.junit.*;

public class LocationFactoryTest {

    @Test
    public void testCreateLocation(){
        String name = "Room 11";
        String city = "Cape Town";
        Address address = AddressFactory.getAddress("Yellow brick rd","Cape Town", "Western Cape");
        Location l = LocationFactory.getLocation(name, address);

        System.out.println(l);
        Assert.assertEquals(name, l.getName());
    }
}