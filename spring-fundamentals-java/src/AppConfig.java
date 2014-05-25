import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Repository;

import ar.com.repository.CustomerRespository;
import ar.com.repository.HibernateCustomerRepositoryImpl;
import ar.com.service.CustomerService;
import ar.com.service.CustomerServiceImpl;





@Configuration
@ComponentScan({"ar.com"}) //Autowired
@PropertySource("app.properties") //Para leer archivos properties (ar/com/model/app.properties)
public class AppConfig {

	
	// --> Autowired injection
	@Bean(name="customerService")
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
	
	//--> Para leer archivos de propiedades
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
