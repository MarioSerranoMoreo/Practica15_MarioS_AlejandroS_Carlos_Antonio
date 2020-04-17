package main.java.liceosorolla;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Columna> columnas=new ArrayList<>();
	
	public void meterCarta(int columna, Carta carta) {
		columnas.get(columna).agregarCarta(carta);
		System.out.println(columna+" g "+carta);
		System.out.println(columnas.get(columna).getCartas().size());
	}
	
	public Tablero() {
		iniciarTablero();	
	}

	private void iniciarTablero() {
		ArrayList <Carta> cartas = new ArrayList<Carta>();
		for(int i=0;i<10;i++) {
			columnas.add(new Columna(cartas));
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
			System.out.println(columnas.get(i).getCartas().size()+"B");
			System.out.println(columnas.get(i).getCartas()+"C");
			if(getColumnas().get(i).getCartas().size()>columnaLarga) {
				columnaLarga=getColumnas().get(i).getCartas().size();
			}
		}
		System.out.println(columnaLarga);
		return columnaLarga;
	}
	public void imprimirTablero() {
		int columnaLarga=calcularColumnaLarga();;
		System.out.println(columnaLarga);
		for(int i=0;i<columnaLarga;i++) {
			for(int j=0;j<10;j++) {
				//System.out.println(getColumnas().get(j).getCartas().get(i)+"A");
			}
		}
	}
}
