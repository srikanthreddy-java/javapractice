package javapractice;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBasicPractice {
	


	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorld.class);
		
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean("name2"));
		
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		
		
		context.close();
	}

}
