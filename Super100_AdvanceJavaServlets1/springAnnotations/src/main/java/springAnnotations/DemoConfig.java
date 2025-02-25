package springAnnotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DemoConfig {
	
	@Bean
	public List m1()
	{
		return new ArrayList(); //creating list object by using child classes arraylist
	}

}
