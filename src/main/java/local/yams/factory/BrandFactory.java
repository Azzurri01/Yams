package local.yams.factory;

import local.yams.util.Misc;
import local.yams.model.Brand;

public class BrandFactory {
    public static Brand getBrand(String name) {
        return new Brand.Builder()
                .brandId(Misc.generateId())
                .name(name)
                .build();
    }
}
