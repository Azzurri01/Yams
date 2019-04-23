package local.yams.factory;

import local.yams.model.Address;
import local.yams.model.Location;
import local.yams.util.Misc;

public class LocationFactory {

    public static Location getLocation(String name, Address address) {
        return new Location.Builder()
                .id(Misc.generateId())
                .name(name)
                .address(address)
                .build();
    }
}
