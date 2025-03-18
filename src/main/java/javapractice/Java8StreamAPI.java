package javapractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8StreamAPI {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Sree", "Koti", "Varshi", "Sree","Maram", "Koti");
		
		
		List<String> output = list.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(output);
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// filter and collect
		List<String> filteredList = list.stream().filter(n->n.startsWith("K")).collect(Collectors.toList());
		
		System.out.println(filteredList);
		
		//map and forEach
		list.stream().map(n->n="Maram ".concat(n)).forEach(System.out::println);
		
		//Sorted and collect
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//distinct
		List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueNumbers);
		
		//Limit
		List<Integer> limitedNumbers = numbers.stream().limit(2).collect(Collectors.toList());
		System.out.println(limitedNumbers);
		
		//skip
		List<Integer> skippedNumbers = numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println(skippedNumbers);
		
		//reduce
		Integer total = numbers.stream().reduce(0, Integer::sum);
		System.out.println(total);
		
		//peak
		List<Integer> modifiedNumbers = numbers.stream().map(n->n =n*3)
				.peek(System.out::print)
				.collect(Collectors.toList());
		
		System.out.println(modifiedNumbers);
		
		//min and max
		
		int min = limitedNumbers.stream().min(Integer::compareTo).orElseThrow();
		System.out.println("min Value:"+min);
		
		int max = numbers.stream().max(Integer::compareTo).orElseThrow();
		System.out.println("max Value:"+max);
		
		//Find Repeated characters from name
		String name = "srikanthreddy";
		Set<Character> set = name.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream().
				filter(n -> n.getValue()>1).
				map(n->n.getKey()).collect(Collectors.toSet());
		System.out.println(set);
		
		//Split List of integer into Odd numbers list and even numbers list
		//approach 1
		List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		List<Integer> oddNumbers = numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(oddNumbers);
		//approach 2
		Map<Boolean, List<Integer>> partitionList = numbers.stream().collect(Collectors.partitioningBy(n-> n%2==0));
		List<Integer> evNumbers = partitionList.get(true);
		List<Integer> odNumbers = partitionList.get(false);
		System.out.println("Even:"+evNumbers+"::::"+"Odd:"+odNumbers);
		
		//approach 3
		numbers.stream()
		.peek(num -> System.out.println(num%2==0?num:""))
		.peek(num -> System.out.println(num%2!=0?num:""));
		
		//filter number which is devide by 5
		numbers.stream().filter(n->n%5==0).forEach(System.out::println);
		
		
		
		
		

	}

}
