package local.yams.model;

public class Brand {
    private String brandId;
    private String name;

    private Brand(Builder builder) {
        this.brandId = builder.brandId;
        this.name = builder.name;
    }

    public String getBrandId() {
        return brandId;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String brandId;
        private String name;

        public Builder brandId(String brandId) {
            this.brandId = brandId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Brand build() {
            return new Brand(this);
        }


    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId='" + brandId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
