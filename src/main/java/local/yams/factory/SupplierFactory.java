package local.yams.factory;

import local.yams.model.Contact;
import local.yams.model.Supplier;
import local.yams.util.Misc;

public class SupplierFactory {
    public static Supplier getSupplier(String name, Contact contact) {
        return new Supplier.Builder()
                .supplierId(Misc.generateId())
                .name(name)
                .contact(contact)
                .build();
    }
}
