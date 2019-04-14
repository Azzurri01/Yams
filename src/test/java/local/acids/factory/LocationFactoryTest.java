package local.acids.factory;

import local.acids.model.Location;
import org.junit.*;

public class LocationFactoryTest {

    @Test
    public void testCreateUser(){
        String name = "Room 11";
        String city = "Cape Town";

        Location l = LocationFactory.getLocation(name, city);
        System.out.println(l);
        Assert.assertEquals(name, l.getName());
    }
}