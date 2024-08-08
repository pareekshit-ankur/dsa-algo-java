package main.java.com.pareekshit;

import main.java.com.pareekshit.collections.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        List<main.java.com.pareekshit.collections.Employee> employeeList = new ArrayList<>();
        employeeList.add(new main.java.com.pareekshit.collections.Employee(1, 1000, "Ramesh"));
        employeeList.add(new main.java.com.pareekshit.collections.Employee(2, 500, "Suresh"));
        employeeList.add(new main.java.com.pareekshit.collections.Employee(3, 2000, "Master"));
        List<main.java.com.pareekshit.collections.Employee> sorted = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).collect(Collectors.toList());
        String s = "127.0.0.0";
        String [] arr = s.split("\\.");
        for (String string : arr) {
            System.out.println(string);
        }
     }


}


