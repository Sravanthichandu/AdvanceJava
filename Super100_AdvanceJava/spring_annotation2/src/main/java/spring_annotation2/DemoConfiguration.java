package spring_annotation2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"spring_annotation2","dto"})//we have to specify n number of packages 
/*if we have to specify n no.of specify its own package also*/
public class DemoConfiguration {

}
