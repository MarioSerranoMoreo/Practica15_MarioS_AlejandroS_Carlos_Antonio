package main.java.liceosorolla;

import java.util.ArrayList;
import java.util.Scanner;

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
					getColumnas().get(j).getCartas().get(i).getOrdinal();
				}else {
					System.out.print("    ");
				}
			}
			System.out.println("");
		}
	}
	public void moverCartas() {
		System.out.println("De que columna quieres mover cartas?");
		Scanner teclado=new Scanner(System.in);
		int columnaInicial=teclado.nextInt()-1;
		System.out.println("Cuantas cartas quieres mover de la columna "+(columnaInicial+1));
		int cantidadCartas=teclado.nextInt();
		if(columnas.get(columnaInicial).comprobarCarta(cantidadCartas)) {
			System.out.println("A que columna quieres mover las cartas?");
			int columnaFinal=teclado.nextInt()-1;
			System.out.println(columnas.get(columnaInicial).getCartas().get(columnas.get(columnaInicial).getCartas().size()-cantidadCartas).getValor()+" hola");
			System.out.println(columnas.get(columnaFinal).getCartas().get(columnas.get(columnaFinal).getCartas().size()-1).getValor()+" adios");
			if(columnas.get(columnaInicial).getCartas().get(columnas.get(columnaInicial).getCartas().size()-cantidadCartas).getValor().ordinal()+1==columnas.get(columnaFinal).getCartas().get(columnas.get(columnaFinal).getCartas().size()-1).getValor().ordinal()) {
				System.out.println("AB");
				for(int i=columnas.get(columnaInicial).getCartas().size()-cantidadCartas;i<columnas.get(columnaInicial).getCartas().size();i++) {
					columnas.get(columnaInicial).getCartas().get(i-1).setBocaArriba(true);
					columnas.get(columnaFinal).agregarCarta(columnas.get(columnaInicial).getCartas().get(i));
				}
				for(int i=0;i<cantidadCartas;i++) {
					columnas.get(columnaInicial).getCartas().remove(columnas.get(columnaInicial).getCartas().size()-(i+1));
				}
			}else {
				System.out.println("No puedes mover a esa columna");
			}
		}else {
			System.out.println("No puedes hacer eso");
		}
		voltearCartas();
	}
	private void voltearCartas() {
		for(int i=0;i<columnas.size();i++) {
			if(!columnas.get(i).getCartas().get(columnas.get(i).getCartas().size()-1).isBocaArriba()) {
				columnas.get(i).getCartas().get(columnas.get(i).getCartas().size()-1).setBocaArriba(true);
			}
		}
	}
}