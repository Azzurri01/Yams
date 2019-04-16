package local.acids.model;

public class Employee {
    private String employeeID;
    private String firstName;
    private String lastName;

    private Employee() {
    }

    private Employee(Builder builder) {
        this.employeeID = builder.employeeID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getUserID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private String employeeID;
        private String firstName;
        private String lastName;

        public Builder employeeID(String employeeID){
            this.employeeID = employeeID;
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

        public Employee build(){
            return new Employee(this);
        }
    }

    @Override

    public String toString() {
        return "Employee{" +
                "userID='" + employeeID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
