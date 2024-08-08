package main.java.com.pareekshit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestCustomer {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        List<Customer> filteredCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getCity().equalsIgnoreCase("Pune")) filteredCustomers.add(customer);
        }

        List<Customer> ls = customers.parallelStream()
                .filter(customer -> customer.getCity().equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

    }

}
