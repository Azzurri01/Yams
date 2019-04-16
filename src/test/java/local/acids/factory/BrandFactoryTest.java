package local.acids.factory;

import local.acids.model.Brand;
import org.junit.Assert;
import org.junit.Test;

public class BrandFactoryTest {
    @Test
    public void testCreateBrand(){
        String name = "Dell";

        Brand dell = BrandFactory.getBrand(name);
        System.out.println(dell);
        Assert.assertEquals(dell.getName(), name);

    }
}
