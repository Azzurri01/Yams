package local.yams.factory;

import local.yams.model.Address;
import local.yams.model.Contact;
import local.yams.model.Supplier;
import local.yams.util.Misc;

public class SupplierFactory {
    public static Supplier getSupplier(String name, Contact contact, Address address) {
        return new Supplier.Builder()
                .name(name)
                .contact(contact)
                .address(address)
                .build();
    }
}
