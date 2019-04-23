package local.yams.model;

public class Asset {

    private String id;
    private String name;
    private String assetTag;
    private String notes;
    private String statusID;
    private String createdAt;
    private String updatedAt;
    private String deletedAt;
    private String serial;
    private Location location;
    private Supplier supplier;

    private Asset() {
    }

    private Asset(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.assetTag = builder.assetTag;
        this.notes = builder.notes;
        this.statusID = builder.statusID;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.deletedAt = builder.deletedAt;
        this.serial = builder.serial;
        this.location = builder.location;
        this.supplier = builder.supplier;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAssetTag() {
        return assetTag;
    }

    public String getNotes() {
        return notes;
    }

    public String getStatusID() {
        return statusID;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public String getSerial() {
        return serial;
    }

    public Location getLocation() {
        return location;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public static class Builder {
        private String id;
        private String name;
        private String assetTag;
        private String notes;
        private String statusID;
        private String createdAt;
        private String updatedAt;
        private String deletedAt;
        private String serial;
        private Location location;
        private Supplier supplier;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder assetTag(String assetTag) {
            this.assetTag = assetTag;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder statusID(String statusID) {
            this.statusID = statusID;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder deletedAt(String deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public Builder serial(String serial) {
            this.serial = serial;
            return this;
        }

        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        public Builder supplier(Supplier supplier) {
            this.supplier = supplier;
            return this;
        }

        public Asset build() {
            return new Asset(this);
        }


    }

    @Override
    public String toString() {
        return "Asset{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", assetTag='" + assetTag + '\'' +
                ", notes='" + notes + '\'' +
                ", statusID='" + statusID + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", deletedAt='" + deletedAt + '\'' +
                ", serial='" + serial + '\'' +
                ", location=" + location +
                ", supplier=" + supplier +
                '}';
    }
}
