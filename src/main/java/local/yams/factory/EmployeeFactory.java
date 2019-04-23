package local.yams.factory;

import local.yams.util.Misc;
import local.yams.model.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String firstName, String lastName) {
        return new Employee.Builder()
                .employeeID(Misc.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
