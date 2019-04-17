package local.acids.model;

public class Supplier {
    private String supplierId;
    private String name;
    private Contact contact;

    private Supplier(){}
    private Supplier(Builder builder){
        this.supplierId = builder.supplierId;
        this.name = builder.name;
        this.contact = builder.contact;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public static class Builder{
        private String supplierId;
        private String name;
        private Contact contact;

        public Builder supplierId(String supplierId){
            this.supplierId = supplierId;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder contact(Contact contact){
            this.contact = contact;
            return this;
        }

        public Supplier build(){return new Supplier(this);}
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
