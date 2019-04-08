package local.acids.model;

public class Staff {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private boolean enabled;

    private Staff(){

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
