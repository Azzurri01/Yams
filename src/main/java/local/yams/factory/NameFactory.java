package local.yams.factory;
import local.yams.model.Name;

public class NameFactory {
    public static Name getName(String firstName, String middleName, String lastName) {
        return new Name.Builder()
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .build();
    }
}
