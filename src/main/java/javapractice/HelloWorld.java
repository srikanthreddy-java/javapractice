package javapractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {}
record Address(String street, String city) {}

@Configuration
public class HelloWorld {
	
	@Autowired
	private Sample sample;
	
	@Bean
	public Sample sample() {
		return new Sample();
	}
	
	@Bean
	@Primary
	public String name() {
		return "srikanth";
	}
	
	@Bean
	public int age() {
		return 31;
	}
	
	@Bean
	@Primary
	public Person person(String name,int age) {
		return new Person(name, age);
	}
	
	@Bean
	public Person person2() {
		return new Person("Koti", 27);
	}
	
	@Bean
	public Address address() {
		return new Address("ChandaNagar", "Hyderabad");
	}
	@Bean
	public String name2() {
		return sample.getName();
	}
	
	

}
