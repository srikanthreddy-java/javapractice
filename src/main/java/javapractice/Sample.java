package javapractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Sample {
	
	@Autowired
	@Qualifier("name")
	private String name;
	
	public String getName() {
		System.out.println(name);
		return name;
	}

}
