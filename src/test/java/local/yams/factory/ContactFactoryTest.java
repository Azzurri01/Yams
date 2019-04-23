package local.yams.factory;

import local.yams.model.Contact;
import org.junit.Assert;
import org.junit.Test;

public class ContactFactoryTest {
    @Test
    public void testCreateNewContact(){
        String phoneNumber = "0115555999";
        String emailAddress = "Joe@soap.local";

        Contact c = ContactFactory.getContact(phoneNumber, emailAddress);
        System.out.println(c);
        Assert.assertEquals(c.getPhoneNumber(),phoneNumber);
    }


}
