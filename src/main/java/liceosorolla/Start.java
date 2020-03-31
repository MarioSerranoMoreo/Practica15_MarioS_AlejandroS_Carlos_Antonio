package main.java.liceosorolla;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		Tablero tablero = new Tablero();
		int opcion=0;
		Scanner teclado= new Scanner(System.in);
		while(opcion!=3) {
			String frase="¿Elige un numero segun lo que quieras hacer:\n1.Sacar nuevas cartas de la baraja\n2.Mover cartas de una columna a otra\n3.Acabar el juego";
			opcion=compruebaInt(frase);
			switch(opcion) {
			case 1:
				
				break;
			case 2:
				
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