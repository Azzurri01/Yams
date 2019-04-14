package local.acids.factory;

import local.acids.model.Asset;
import org.junit.*;

public class AssetFactoryTest {
    @Test
    public void testCreateAsset(){
        String name = "Monitor";
        String assetTag = "J0001";
        String notes = "Just some random note";
        String serial = "007";

        Asset a = AssetFactory.getAsset(name, assetTag, notes, serial);
        System.out.println(a);
        Assert.assertEquals(serial, a.getSerial());
    }
}