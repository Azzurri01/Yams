package local.yams.factory;

import local.yams.model.Asset;
import local.yams.util.Misc;

public class AssetFactory {
    public static Asset getAsset(String name, String assetTag, String notes, String serial) {
                return new Asset.Builder().id(Misc.generateId()).name(name).assetTag(assetTag).notes(notes).statusID(null).createdAt(Misc.getTodaysDate()).updatedAt(null).deletedAt(null).serial(serial).build();

    }
}
