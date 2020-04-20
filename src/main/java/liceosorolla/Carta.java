package main.java.liceosorolla;

public class Carta {
	private boolean bocaArriba;
	private Valor valor;
	public Carta(boolean bocaArriba, Valor valor) {
		this.bocaArriba = bocaArriba;
		this.valor = valor;
	}
	public boolean isBocaArriba() {
		return bocaArriba;
	}
	public void setBocaArriba(boolean bocaArriba) {
		this.bocaArriba = bocaArriba;
	}
	public Valor getValor() {
		return valor;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Carta [bocaArriba=" + bocaArriba + ", valor=" + valor + "]";
	}
	public void getOrdinal() {
		switch(getValor().ordinal()+1) {
		case 11:
			System.out.print("  J ");
			break;
		case 12:
			System.out.print("  Q ");
			break;
		case 13:
			System.out.print("  K ");
			break;
		case 1:
			System.out.print("  A ");
			break;
		case 10:
			System.out.print(" 10 ");
			break;
		default:
			System.out.print("  "+(getValor().ordinal()+1)+" ");
			break;
		}
	}
}
