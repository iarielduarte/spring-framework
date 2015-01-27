package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Audiencia {

	public void sentarse(){
		System.out.println("El show esta por comenzar, porfavor tomar haciento..");
	}
	
	public void apagarCelulares(){
		System.out.println("Favor apagar los celulares..");
	}
	
	public void aplaudir(){
		System.out.println("El show a terminado, bravo..bravo..chap chap chap..");
	}
	
	public void devolucion(){
		System.out.println("Terrible presentacion, se devolveran las entradas");
	}
}
