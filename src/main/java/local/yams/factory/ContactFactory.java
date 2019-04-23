package local.yams.factory;

import local.yams.model.Contact;

public class ContactFactory {
    public static Contact getContact(String phoneNumber, String emailAddress) {
        return new Contact.Builder()
                .phoneNumber(phoneNumber)
                .emailAddress(emailAddress)
                .build();
    }
}
