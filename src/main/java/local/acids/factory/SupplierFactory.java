package local.acids.factory;

import local.acids.model.Contact;
import local.acids.model.Supplier;
import local.acids.util.Misc;

public class SupplierFactory {
    public static Supplier getSupplier(String name, Contact contact) {
        return new Supplier.Builder()
                .supplierId(Misc.generateId())
                .name(name)
                .contact(contact)
                .build();
    }
}
