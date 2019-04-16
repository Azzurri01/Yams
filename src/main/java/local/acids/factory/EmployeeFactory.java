package local.acids.factory;

import local.acids.util.Misc;
import local.acids.model.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String firstName, String lastName) {
        return new Employee.Builder()
                .employeeID(Misc.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
