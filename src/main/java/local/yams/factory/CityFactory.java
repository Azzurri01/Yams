package local.yams.factory;

import local.yams.model.City;
import local.yams.util.Misc;

public class CityFactory {
    public static City getCity(String name) {
        return new City.Builder()
                .cityId(Misc.generateId())
                .name(name)
                .build();
    }
}
