package local.acids.factory;

import local.acids.model.Supplier;
import org.junit.Assert;
import org.junit.Test;

public class SupplierFactoryTest {
    @Test
    public void testCreateSupplier(){
        String name = "Takealot";

        Supplier s = SupplierFactory.getSupplier(name);
        System.out.println(s);
        Assert.assertEquals(s.getName(), name);
    }
}
