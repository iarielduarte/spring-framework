package ar.com.interprete.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@Bean
	public InterpreteEspanol inEspanol(){
		return new InterpreteEspanol();
	}
	
	@Bean
	public InterpreteIngles inIngles(){
		return new InterpreteIngles();
	}
	
	@Bean(name="espanol")
	public Traductor traductorEspanol(){
		Traductor t = new Traductor();
		t.setInterprete(inEspanol());
		t.setNombre("Ariel Duarte");
		return t;
	}
	
	@Bean(name="ingles")
	public Traductor traductorIngles(){
		Traductor t = new Traductor();
		t.setInterprete(inIngles());
		t.setNombre("Eric Donak");
		return t;
	}
	
	
}
