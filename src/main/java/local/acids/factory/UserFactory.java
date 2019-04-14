package local.acids.factory;

import local.acids.model.User;
import local.acids.util.Misc;

public class UserFactory {
    public static User getUser(String firstName, String lastName, String emailAddress) {
        return new User.Builder()
                .id(Misc.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .emailAddress(emailAddress)
                .build();
    }
}
