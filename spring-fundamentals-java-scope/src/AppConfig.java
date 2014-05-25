import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import ar.com.repository.CustomerRespository;
import ar.com.repository.HibernateCustomerRepositoryImpl;
import ar.com.service.CustomerService;
import ar.com.service.CustomerServiceImpl;





@Configuration
@ComponentScan({"ar.com"}) //Autowired
public class AppConfig {

	
	// --> Autowired injection
	@Bean(name="customerService")
	@Scope("singleton")
//	@Scope("prototype")
	public CustomerService getCustomerService(){
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		return customerService;
	}
	
	// --> Constructor injection
//	@Bean(name="customerService")
//	public CustomerService getCustomerService(){
//		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//		return customerService;
//	}
	
	// --> Setter injection
//	@Bean(name="customerService")
//	public CustomerService getCustomerService(){
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
//		customerService.setCustomerRepository(getCustomerRepository());
//		return customerService;
//	}
	
	//--> Comentamos esto y usamos en la clase HibernateCustomerRepositoryImpl @Repository
//	@Bean(name="customerRepository")
//	public CustomerRespository getCustomerRepository(){
//		return new HibernateCustomerRepositoryImpl();
//	}
}
