package main.java.liceosorolla;

import java.util.ArrayList;

public class Columna {
	private ArrayList<Carta> cartas=new ArrayList<>();
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public Columna() {
		
	}
	
	public String toString() {
		return "Carta"+"cartas";
	}
	
	public boolean comprobarCarta(int cantidad) {
		boolean devolver=true;
		int valor1;
		int valor2;
		
		if(cantidad>1) {
			for(int i=cartas.size()-1; i>cartas.size()-cantidad&&devolver; i--) {
				//System.out.println("A");
				if(cartas.get(i-1).isBocaArriba()) {
					//System.out.println("B");
					valor1=cartas.get(i).getValor().ordinal();
					valor2=cartas.get(i-1).getValor().ordinal();
					if(valor1+1==valor2) {
						//System.out.println("C");
						devolver=true;
					}else {
						//System.out.println("D");
						devolver=false;
					}
				}else {
					//System.out.println("E");
					devolver=false;
				}
			}
		}
		
		return devolver;
	}
	
	public void agregarCarta(Carta nuevaCarta) {
		cartas.add(nuevaCarta);
	}
}
