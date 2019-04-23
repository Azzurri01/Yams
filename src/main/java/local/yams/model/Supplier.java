package local.yams.model;

public class Supplier {
    private String name;
    private Contact contact;
    private Address address;

    private Supplier() {
    }

    private Supplier(Builder builder) {
        this.name = builder.name;
        this.contact = builder.contact;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public Address getAddress() {
        return address;
    }

    public static class Builder {
        private String name;
        private Contact contact;
        private Address address;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Supplier build() {
            return new Supplier(this);
        }
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }
}
