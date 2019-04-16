package local.acids.factory;

import local.acids.model.Supplier;
import local.acids.util.Misc;

public class SupplierFactory {
    public static Supplier getSupplier(String name) {
        return new Supplier.Builder()
                .supplierId(Misc.generateId())
                .name(name)
                .build();
    }
}
