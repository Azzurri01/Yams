package local.acids.factory;

import local.acids.util.Misc;
import local.acids.model.Brand;

public class BrandFactory {
    public static Brand getBrand(String name) {
        return new Brand.Builder()
                .brandId(Misc.generateId())
                .name(name)
                .build();
    }
}
