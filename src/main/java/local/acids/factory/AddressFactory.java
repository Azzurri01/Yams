package local.acids.factory;

import local.acids.model.Address;
import local.acids.util.Misc;

public class AddressFactory {

    public static Address getAddress(String address1, String address2) {
        return new Address.Builder()
                .addressId(Misc.generateId())
                .address1(address1)
                .address2(address2)
                .build();
    }
}
