package local.acids.factory;
import local.acids.model.Location;
import local.acids.util.Misc;

public class LocationFactory {

    public static Location getLocation(String name, String city) {
        return new Location.Builder().id(Misc.generateId()).name(name).city(city).build();
    }
}
