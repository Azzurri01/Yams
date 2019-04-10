package local.acids.model;

public class User {

    private String userID;
    private String firstName;
    private String lastName;
    private String emailAddress;

    private User(){}

    private User(Builder builder){
        this.userID = builder.userID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailAddress = builder.emailAddress;
    }

    public String getUserID(){return userID;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getEmailAddress(){return emailAddress;}

    public static class Builder{

        private String userID;
        private String firstName;
        private String lastName;
        private String emailAddress;

        public Builder userID(String userID){
            this.userID = userID;
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

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
