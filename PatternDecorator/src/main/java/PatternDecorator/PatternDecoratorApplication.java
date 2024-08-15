package PatternDecorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PatternDecoratorApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(PatternDecoratorApplication.class, args);


		JuniorJavaDeveloper bean = context.getBean(JuniorJavaDeveloper.class);


	}

}
