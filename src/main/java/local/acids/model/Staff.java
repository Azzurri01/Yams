package local.acids.model;

public class Staff {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private boolean staffAccountDisabled;

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

    public boolean isStaffAccountDisabled() {
        return staffAccountDisabled;
    }

    private Staff(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailAddress = builder.emailAddress;
        this.staffAccountDisabled = builder.staffAccountDisabled;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String emailAddress;
        private boolean staffAccountDisabled;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder staffAccountDisabled(Boolean staffAccountDisabled){
            this.staffAccountDisabled = staffAccountDisabled;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", staffAccountDisabled=" + staffAccountDisabled +
                '}';
    }

}
