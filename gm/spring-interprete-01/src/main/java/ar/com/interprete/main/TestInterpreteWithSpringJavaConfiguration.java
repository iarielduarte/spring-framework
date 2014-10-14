package ar.com.interprete.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ar.com.interprete.beans.AppConfiguration;
import ar.com.interprete.beans.Traductor;

public class TestInterpreteWithSpringJavaConfiguration {
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(AppConfiguration.class);
		
	//	Traductor traductor = ctx.getBean(Traductor.class);
		
		Traductor traductorEspanol = (Traductor) ctx.getBean("espanol");
		traductorEspanol.hablar();
		
		Traductor traductorIngles = (Traductor) ctx.getBean("ingles");
		traductorIngles.hablar();

	}

}
