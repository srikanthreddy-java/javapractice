package javapractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

record Employee(String name, int salary, String department) {
}

public class EmployeeOperations {

	public void performOperations(List<Employee> employees) {
		double avgSal = employees.stream().mapToDouble(Employee::salary).average().orElse(0);
		System.out.println(avgSal);
		List<String> empNames = employees.stream().filter(emp -> emp.salary() > avgSal)
				.map(emp -> emp.name()+"->"+emp.salary())
				.collect(Collectors.toList());
		System.out.println(empNames);

		Map<String, Integer> highestSalaryByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::department,
						Collectors.collectingAndThen
						(Collectors.maxBy(Comparator.comparingInt(Employee::salary)),
								optEmp -> optEmp.map(Employee::salary).orElse(0))));
		
		System.out.println(highestSalaryByDept);
		
		Map<String,Integer> empNameSal = employees.stream().collect(Collectors.toMap(Employee::name, Employee::salary));
		System.out.println(empNameSal);
	}

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 60000, "IT"),
				new Employee("Bob", 75000, "Finance"), new Employee("Charlie", 50000, "HR"),
				new Employee("David", 90000, "IT"), new Employee("Eve", 65000, "Marketing"),
				new Employee("Frank", 72000, "Finance"), new Employee("Grace", 85000, "HR"),
				new Employee("Hank", 55000, "IT"), new Employee("Ivy", 95000, "Marketing"),
				new Employee("Jack", 62000, "Finance"), new Employee("Kim", 70000, "IT"),
				new Employee("Leo", 67000, "HR"), new Employee("Mia", 80000, "Marketing"),
				new Employee("Nick", 91000, "Finance"), new Employee("Olivia", 54000, "IT"),
				new Employee("Paul", 58000, "HR"), new Employee("Quinn", 73000, "Marketing"),
				new Employee("Rachel", 68000, "Finance"), new Employee("Steve", 88000, "IT"),
				new Employee("Tina", 94000, "HR"));
		EmployeeOperations operations = new EmployeeOperations();
		operations.performOperations(employees);
		
		
		
		Integer[] arr= {1,2,3,4};
		List<Integer> list = Arrays.asList(arr).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		
		String str1 = new String("srikanth");
		String str2 = "srikanth";
		
		System.out.println("srikanth"==str1);
		
		Map<String, Double> result = new HashMap<>();
		for(Employee emp: employees) {
			result.put(emp.department(), result.getOrDefault(emp.department(), 0.0)+emp.salary());
		}
		System.out.println(result);
		
		Predicate<Employee> graterThan70KPredicate = (emp) -> emp.salary()>70000;
		Predicate<Employee> lessThan80KPredicate = (emp) -> emp.salary()<80000;
		Predicate<Employee> comPredicate = graterThan70KPredicate.and(lessThan80KPredicate);
		
		
		List<Employee> empGraerThan70k = employees.stream().filter(comPredicate).collect(Collectors.toList());
		System.out.println(empGraerThan70k);
	}
}
