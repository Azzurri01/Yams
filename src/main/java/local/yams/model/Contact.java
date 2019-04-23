package local.yams.model;

public class Contact {
    private String phoneNumber;
    private String emailAddress;

    public Contact() {
    }

    public Contact(Builder builder) {
        this.phoneNumber = builder.phoneNumber;
        this.emailAddress = builder.emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public static class Builder {
        String phoneNumber;
        String emailAddress;

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    }

}
