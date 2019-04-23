package local.yams.factory;

import local.yams.util.Misc;
import local.yams.model.Customer;

public class CustomerFactory {
    public static Customer getCustomer(String firstName, String lastName, String email, String cellPhoneNumber) {
        return new Customer.Builder()
                .customerId(Misc.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .cellPhoneNumber(cellPhoneNumber)
                .build();
    }
}
