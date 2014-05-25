import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.service.CustomerService;


public class Application {

	public static void main(String[] args) {
		ApplicationContext appContxt = new ClassPathXmlApplicationContext("applicactionContext.xml");
		System.out.println("Test Singleton");
		CustomerService service = appContxt.getBean("customerService",CustomerService.class);
		System.out.println(service);
		CustomerService service2 = appContxt.getBean("customerService",CustomerService.class);
		System.out.println(service2);
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
