package local.yams.model;

public class City {
    private String cityId;
    private String name;

    private City(){}
    private City(Builder builder){
        this.cityId = builder.cityId;
        this.name = builder.name;
    }

    public String getCityId() {
        return cityId;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String cityId;
        private String name;

        public Builder cityId(String cityId){
            this.cityId = cityId;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }

        public City build(){return new City(this);}
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId='" + cityId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
