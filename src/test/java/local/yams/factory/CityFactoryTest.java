package local.yams.factory;

import local.yams.model.City;
import org.junit.Assert;
import org.junit.Test;

public class CityFactoryTest {
    @Test
    public void testCreateCity() {
        String name = "Durban";

        City durban = CityFactory.getCity(name);
        System.out.println(durban);
        Assert.assertEquals(durban.getName(), name);

    }
}
