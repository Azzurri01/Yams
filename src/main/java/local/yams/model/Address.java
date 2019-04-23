package local.yams.model;

public class Address {
    private String street;
    private String city;
    private String state;

    private Address() {
    }

    private Address(Builder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public static class Builder {
        private String street;
        private String city;
        private String state;

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Address build() {
            return new Address(this);
        }

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
