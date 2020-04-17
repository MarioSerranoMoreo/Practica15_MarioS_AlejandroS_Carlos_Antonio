package main.java.liceosorolla;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Columna> columnas;
	
	public void meterCarta(int columna, Carta carta) {
	  
		columnas.get(columna).getCartas().add(carta);
		
	}
	
	public Tablero() {
		iniciarTablero();	
		}

	private void iniciarTablero() {
		ArrayList <Carta> cartas = new ArrayList<Carta>();
		for(int i=0;i<8;i++) {
			columnas.add(new Columna(cartas));
		}
	}
}
