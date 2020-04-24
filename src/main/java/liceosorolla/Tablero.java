package main.java.liceosorolla;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Columna> columnas=new ArrayList<>();
	
	public void meterCarta(int columna, Carta carta) {
		columnas.get(columna).agregarCarta(carta);
	}
	
	public Tablero() {
		iniciarTablero();	
	}

	private void iniciarTablero() {
		
		for(int i=0;i<10;i++) {
			columnas.add(new Columna());
		}
	}

	public ArrayList<Columna> getColumnas() {
		return columnas;
	}

	public void setColumnas(ArrayList<Columna> columnas) {
		this.columnas = columnas;
	}
	private int calcularColumnaLarga() {
		int columnaLarga=0;
		for(int i=0;i<getColumnas().size()-1;i++) {
			if(getColumnas().get(i).getCartas().size()>columnaLarga) {
				columnaLarga=getColumnas().get(i).getCartas().size();
			}
		}
		return columnaLarga;
	}
	public void imprimirTablero() {
		int columnaLarga=calcularColumnaLarga();
		for(int i=0;i<columnaLarga;i++) {
			for(int j=0;j<10;j++) {
				if(getColumnas().get(j).getCartas().size()>i){
					//System.out.println(getColumnas().get(j).getCartas().size()+ " H");
					getColumnas().get(j).getCartas().get(i).getOrdinal();
				}
			}
			System.out.println("");
		}
	}
}