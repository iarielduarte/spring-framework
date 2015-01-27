package test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import concursantes.Concursante;
import concursantes.Malabarista;
import concursantes.Musico;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestConcursoTalento {

	private static Log logger = LogFactory
			.getLog("Running  TestConcursoTalento");
	@Autowired
	@Qualifier("solei")
	private Concursante malabarista1;
	@Autowired
	@Qualifier("soleiRecitador")
	private Concursante malabarista2;
	@Autowired
	@Qualifier("jasonPiano")
	private Concursante musico1;
	@Autowired
	@Qualifier("jasonSax")
	private Concursante musico2;

	@Test
	public void testMalabarista() {
		logger.info("Inicio de ejecutar Solei");
		int noPelotas = 10;
		malabarista1.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista1).getPelotas());
		logger.info("Fin de ejecutar Malabarista");
		logger.info("Inicio de ejecutar SoleiRecitador");
		noPelotas = 15;
		malabarista2.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista2).getPelotas());
		logger.info("Fin de ejecutar Malabarista Recitador");
		logger.info("Inicio de ejecutar Jason Piano");
		String cancion = "Lluvia de Noviembre";
		musico1.ejecutar();
		assertEquals(cancion, ((Musico) musico1).getCancion());
		logger.info("Fin de ejecutar Jason Piano");
		logger.info("Inicio de ejecutar Jason Saxofonista");
		cancion = "Man Blue";
		musico2.ejecutar();
		assertEquals(cancion, ((Musico) musico2).getCancion());
		logger.info("Fin de ejecutar Jason Saxofonista");
	}

}
