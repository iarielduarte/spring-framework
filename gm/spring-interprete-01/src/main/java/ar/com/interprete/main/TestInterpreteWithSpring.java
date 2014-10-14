package ar.com.interprete.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.interprete.beans.Traductor;

public class TestInterpreteWithSpring {
	
	
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Traductor traductorEspanol = (Traductor) factory.getBean("traductorEspanol");
		traductorEspanol.hablar();
		
		Traductor traductorIngles = (Traductor) factory.getBean("traductorIngles");
		traductorIngles.hablar();

	}

}
