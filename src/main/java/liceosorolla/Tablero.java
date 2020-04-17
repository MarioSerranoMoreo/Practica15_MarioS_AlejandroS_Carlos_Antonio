package main.java.liceosorolla;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Columna> columnas;
	
	public void meterCarta(int columna, Carta carta) {
	  
		columnas.get(columna).getCartas().add(carta);
		
	}

}
