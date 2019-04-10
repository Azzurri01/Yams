package local.acids.factory;
import local.acids.model.Staff;

public class StaffFactory {

    public static Staff getStaff(String firstName, String lastName, String emailAddress){

        return new Staff.Builder().firstName(firstName).lastName(lastName).emailAddress(emailAddress).staffAccountDisabled(false).build();
    }
}