package local.yams.factory;

import local.yams.util.Misc;
import local.yams.model.Department;

public class DepartmentFactory {
    public static Department getDepartment(String name) {
        return new Department.Builder()
                .departmentId(Misc.generateId())
                .name(name)
                .build();
    }

}
