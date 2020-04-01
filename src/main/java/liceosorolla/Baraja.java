package main.java.liceosorolla;

import java.util.ArrayList;
import java.util.Random;

public class Baraja {
	
	private ArrayList<Carta> cartas;
	

	public Baraja() {
		generarCarta();
		barajar();
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	private void generarCarta() {
		for (int i=0; i<8; i++) {
			for(Valor valor: Valor.values()) {
				cartas.add(new Carta(false, valor));
			}
		}
	}
	
	private void barajar() {
		
		ArrayList<Carta> carta2 = new ArrayList<>();
		
		while(!cartas.isEmpty()) {
			
			int x = sacarCarta(cartas.size());
			carta2.add(cartas.get(x));
			cartas.remove(x);
		}
		cartas=carta2;
	}
	
	private int sacarCarta(int cartas) {
		int numero = (int) (Math.random() * cartas);
		return numero;
	}
}
