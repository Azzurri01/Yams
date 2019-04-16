package local.acids.model;

public class Department {
    private String departmentId;
    private String name;

    private Department() {
    }

    private Department(Builder builder) {
        this.departmentId = builder.departmentId;
        this.name = builder.name;
    }


    public String getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public static class Builder{
        private String departmentId;
        private String name;

        public Builder departmentId(String departmentId){
            this.departmentId = departmentId;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Department build(){
            return new Department(this);
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
