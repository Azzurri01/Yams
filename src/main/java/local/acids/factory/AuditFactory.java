package local.acids.factory;

import local.acids.model.Audit;
import local.acids.util.Misc;

public class AuditFactory {
    public static Audit getAudit(String userID, String assetID, String locationID, String statusID) {
        return new Audit.Builder().id(Misc.generateId()).date(Misc.getTodaysDate()).userID(userID).assetID(assetID).locationID(locationID).statusID(statusID).build();
    }
}
