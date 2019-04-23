package local.yams.factory;

import local.yams.model.Address;

public class AddressFactory {

    public static Address getAddress(String street, String city, String state) {
        return new Address.Builder()
                .street(street)
                .city(city)
                .state(state)
                .build();
    }
}