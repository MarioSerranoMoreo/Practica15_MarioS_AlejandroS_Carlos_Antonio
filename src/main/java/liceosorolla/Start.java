package main.java.liceosorolla;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		Tablero tablero = new Tablero();
		int numero=0;
		int numeroCarta=0;
		int columna=0;
		Carta suplente;
		while(numero<54) {
			if(columna<10) {
				numeroCarta=baraja.sacarCarta();
				suplente=baraja.getCartas().get(numeroCarta);
				baraja.getCartas().remove(numeroCarta);
				tablero.meterCarta(columna,suplente);
				columna++;
				numero++;
			}else {
				columna=0;
			}
		}
		tablero.imprimirTablero();
		int opcion=0;
		/*for(int i=0;i<baraja.getCartas().size();i++) {
			System.out.println(baraja.getCartas().get(i));
		}*/
		Scanner teclado= new Scanner(System.in);
		
		//menu
		while(opcion!=3) {
			String frase="¿Elige un numero segun lo que quieras hacer:\n1.Sacar nuevas cartas de la baraja\n2.Mover cartas de una columna a otra\n3.Acabar el juego";
			opcion=compruebaInt(frase);
			switch(opcion) {
			case 1:
				//pasar cartas de la baraja al tablero(10 cartas)
				
				break;
			case 2:
				//mover cartas de una columna a otra
				
				break;
			case 3:
				 System.out.println("Adios");
				break;
			default:
				System.out.println("Numero no valido");
				break;
			}
		}
	}
	public static int compruebaInt(String frase) {
		Scanner teclado= new Scanner(System.in);
		int numero=0;
		boolean bool=false;
			while(!bool) {
			System.out.println(frase);
			bool=teclado.hasNextInt();
			if(bool) {
				numero=teclado.nextInt();
			}
		}
		return numero;
	}
}