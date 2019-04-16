package local.acids.model;

public class Supplier {
    private String supplierId;
    private String name;

    private Supplier(){}
    private Supplier(Builder builder){
        this.supplierId = builder.supplierId;
        this.name = builder.name;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public static class Builder{
        private String supplierId;
        private String name;

        public Builder supplierId(String supplierId){
            this.supplierId = supplierId;
            return this;
        }

        public Builder name(String name){
            this.name = name;
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
