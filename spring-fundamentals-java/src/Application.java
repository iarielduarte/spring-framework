import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ar.com.service.CustomerService;
import ar.com.service.CustomerServiceImpl;


public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		
		
		System.out.println(service.findAll().get(0).getFirstname());
		System.out.println(service.findAll().get(0).getLastname());
	}

}
