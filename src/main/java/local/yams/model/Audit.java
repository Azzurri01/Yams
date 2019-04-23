// Todo
//    + id
//    + user_id
//    + asset_id
//    + location_id

package local.yams.model;

public class Audit {
    private String id;
    private String date;
    private String userID;
    private String assetID;
    private String locationID;
    private String statusID;

    private Audit() {
    }

    private Audit(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.userID = builder.userID;
        this.assetID = builder.assetID;
        this.locationID = builder.locationID;
        this.statusID = builder.statusID;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getUserID() {
        return userID;
    }

    public String getAssetID() {
        return assetID;
    }

    public String getLocationID() {
        return locationID;
    }

    public String getStatusID(){return statusID;}

    public static class Builder {
        private String id;
        private String date;
        private String userID;
        private String assetID;
        private String locationID;
        private String statusID;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        public Builder assetID(String assetID){
            this.assetID = assetID;
            return this;
        }

        public Builder locationID(String locationID){
            this.locationID = locationID;
            return this;
        }

        public Builder statusID(String statusID){
            this.statusID = statusID;
            return this;
        }

        public Audit build(){
            return new Audit(this);
        }
    }

    @Override
    public String toString() {
        return "Audit{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", userID='" + userID + '\'' +
                ", assetID='" + assetID + '\'' +
                ", locationID='" + locationID + '\'' +
                '}';
    }
}
