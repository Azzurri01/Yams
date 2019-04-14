package local.acids.model;

public class Location {

    private String id;
    private String name;
    private String city;

    private Location() {
    }

    private Location(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.city = builder.city;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public static class Builder {
        private String id;
        private String name;
        private String city;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Location build() {
            return new Location(this);
        }
    }

    @Override
    public String toString() {
        return "Location{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
