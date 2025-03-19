package javapractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

record Employee(String name, double salary, String department) {}

public class EmployeeOperations {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
        		new Employee("Alice", 60000, "IT"),
                new Employee("Bob", 75000, "Finance"),
                new Employee("Charlie", 50000, "HR"),
                new Employee("David", 90000, "IT"),
                new Employee("Eve", 65000, "Marketing"),
                new Employee("Frank", 72000, "Finance"),
                new Employee("Grace", 85000, "HR"),
                new Employee("Hank", 55000, "IT"),
                new Employee("Ivy", 95000, "Marketing"),
                new Employee("Jack", 62000, "Finance"),
                new Employee("Kim", 70000, "IT"),
                new Employee("Leo", 67000, "HR"),
                new Employee("Mia", 80000, "Marketing"),
                new Employee("Nick", 91000, "Finance"),
                new Employee("Olivia", 54000, "IT"),
                new Employee("Paul", 58000, "HR"),
                new Employee("Quinn", 73000, "Marketing"),
                new Employee("Rachel", 68000, "Finance"),
                new Employee("Steve", 88000, "IT"),
                new Employee("Tina", 94000, "HR")
        );

        double avgSal = employees.stream()
				        		.mapToDouble(Employee::salary)
				        		.average()
				        		.orElse(0);
        System.out.println(avgSal);
        List<String> empNames = employees.stream()
        		.filter(emp -> emp.salary()>avgSal)
        		.map(emp -> emp.name()).collect(Collectors.toList());
        System.out.println(empNames);
        
        Map<String, Double> highestSalaryByDept = employees.stream()
        .collect(Collectors.groupingBy(Employee::department,
        		Collectors.collectingAndThen(
        				Collectors.maxBy(Comparator.comparingDouble(Employee::salary)),
        				optEmp->optEmp.map(Employee::salary).orElse(0.0)
        		)));
        
        System.out.println(highestSalaryByDept);
        
    }
}

