package local.acids.model;

public class Status {

    private String id;
    private String name;

    private Status() {
    }

    private Status(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String id;
        private String name;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Status build() {
            return new Status(this);
        }
    }

    @Override
    public String toString() {
        return "Status{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
