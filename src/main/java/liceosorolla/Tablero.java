package main.java.liceosorolla;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Columna> columnas;
	
	public void meterCarta(int columna, boolean bool, Valor valor) {
	  
		columnas.get(columna).getCartas().add(new Carta(bool,valor));
		
	}

}
