package main.java.com.pareekshit;

import main.java.com.pareekshit.collections.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test4 {
    public static void main(String[] args) {
        /*int[] arr = new int[]{1, 3, 2, 4, 6, 7, 8, 9, 4, 6};
        int[] freq = new int[11];
        for (int i : arr) {
            freq[i] += 1;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1)
                System.out.print(i + " ");
        }
        System.out.println();*/


        List<Employee> employeeList = new ArrayList<Employee>(
                Arrays.asList(new Employee(1, "AA", 600, 33),
                        new Employee(2, "BB", 199, 44),
                        new Employee(3, "CC", 500, 33),
                        new Employee(4, "DD", 300, 22),
                        new Employee(5, "EE", 400, 11),
                        new Employee(6, "FF", 100, 11)));

        employeeList.stream().filter(employee -> employee.getSalary() < 200).forEach(employee -> employee.setSalary(employee.getSalary() + 100));
        employeeList.forEach(employee -> System.out.println(employee.getSalary()));
        employeeList.stream().filter(employee -> employee.getName().equals("abc")).collect(Collectors.toList());
    }
}
