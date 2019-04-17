package local.acids.factory;
import local.acids.model.Name;

public class NameFactory {
    public static Name getName(String firstName, String middleName, String lastName) {
        return new Name.Builder()
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .build();
    }
}
