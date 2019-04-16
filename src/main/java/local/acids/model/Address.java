package local.acids.model;

public class Address {
    private String addressId;
    private String address1;
    private String address2;

    private Address() {
    }

    private Address(Builder builder) {
        this.addressId = builder.addressId;
        this.address1 = builder.address1;
        this.address2 = builder.address2;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public static class Builder {
        private String addressId;
        private String address1;
        private String address2;

        public Builder addressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        public Builder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        public Address build() {
            return new Address(this);
        }

    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                '}';
    }
}
