package local.acids.factory;

import local.acids.model.City;
import local.acids.util.Misc;

public class CityFactory {
    public static City getCity(String name) {
        return new City.Builder()
                .cityId(Misc.generateId())
                .name(name)
                .build();
    }
}
