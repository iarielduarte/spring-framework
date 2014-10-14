package ar.com.interprete.main;

import ar.com.interprete.beans.InterpreteEspanol;
import ar.com.interprete.beans.Traductor;

public class TestInterprete {

	public static void main(String[] args) {
		Traductor traductor = new Traductor();
		InterpreteEspanol interprete = new InterpreteEspanol();
		
		//El interprete se inyecta manualmente 
		//Solo puede recibir un interprete en español
		//No un interprete en ingles u otros idiomas
		
		traductor.setInterprete(interprete);
		traductor.setNombre("Ariel Duarte");
		traductor.hablar();
		
	}

}
