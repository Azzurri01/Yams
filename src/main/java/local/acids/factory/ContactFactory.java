package local.acids.factory;

import local.acids.model.Contact;

public class ContactFactory {
    public static Contact getContact(String phoneNumber, String emailAddress) {
        return new Contact.Builder()
                .phoneNumber(phoneNumber)
                .emailAddress(emailAddress)
                .build();
    }
}
