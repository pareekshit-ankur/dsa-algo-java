package main.java.com.pareekshit;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Practice {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(134, "Martin Theron1", 29, "Male", "Infrastructure", 2012, 18000.0));

        Employee maxSalaryEmployee = employeeList.get(0);
        for (Employee employee : employeeList) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        System.out.println(maxSalaryEmployee);

        Employee max = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(max);


        Map<Employee, String> map = new HashMap<>();
        Employee employee1 = new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
        map.put(employee1, "abc");
        map.put(employee1, "xyz");
        System.out.println(map);

        List<Integer> numbers = Arrays.asList(1, 2, 4, 3, 2, 1, 6, 7);
        Map<Integer, Integer> integerMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(value -> 1)));
        integerMap.forEach((integer, integer2) -> System.out.println(integer + " " + integer2));
        int[] result = integerMap.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).limit(2).mapToInt(Map.Entry::getKey).toArray();
        Arrays.stream(result).forEach(System.out::println);
        List<Integer> res = Arrays.stream(numbers.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(value -> 1)))
                        .entrySet().stream()
                        .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                        .limit(2)
                        .mapToInt(Map.Entry::getKey)
                        .toArray()).boxed()
                .collect(Collectors.toList());
        res.forEach(System.out::println);
    }
}
