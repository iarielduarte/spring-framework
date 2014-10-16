package test;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.Concursante;
import concursantes.Malabarista;

public class TestConcursoTalento {

	private static Log logger = LogFactory
			.getLog("Running  TestConcursoTalento");
	private Concursante malabarista1;

	@Before
	public void before() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		malabarista1 = (Concursante) ctx.getBean("solei");
	}

	@Test
	public void testMalabarista() {
		logger.info("Inicio de la ejecuccion de la prueba Malabarista");
		int noPelotas = 5;
		malabarista1.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista1).getPelotas());
		logger.info("Fin de la ejecuccion de la prueba Malabarista");
	}

}
