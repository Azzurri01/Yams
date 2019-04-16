package local.acids.factory;

import local.acids.util.Misc;
import local.acids.model.Department;

public class DepartmentFactory {
    public static Department getDepartment(String name) {
        return new Department.Builder()
                .departmentId(Misc.generateId())
                .name(name)
                .build();
    }

}
