package local.acids.model;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String cellPhoneNumber;

    private Customer() {
    }

    private Customer(Builder builder){
        this.customerId = builder.customerId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.cellPhoneNumber = builder.cellPhoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public static class Builder {
        private String customerId;
        private String firstName;
        private String lastName;
        private String email;
        private String cellPhoneNumber;

        public Builder customerId(String customerId){
            this.customerId = customerId;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder cellPhoneNumber(String cellPhoneNumber){
            this.cellPhoneNumber = cellPhoneNumber;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", cellPhoneNumber='" + cellPhoneNumber + '\'' +
                '}';
    }
}
