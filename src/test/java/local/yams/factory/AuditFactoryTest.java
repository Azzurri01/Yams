package local.yams.factory;

import local.yams.model.Audit;
import local.yams.util.Misc;
import org.junit.Assert;
import org.junit.Test;

public class AuditFactoryTest {
    @Test
    public void testCreateAuditEntry(){
        String userID = "U001";
        String assetID = "A001";
        String locationID = "L001";
        String statusID = "S001";

        Audit a = AuditFactory.getAudit(userID, assetID, locationID, statusID);
        System.out.println(a);
        Assert.assertEquals(a.getDate(), Misc.getTodaysDate());
    }
}
