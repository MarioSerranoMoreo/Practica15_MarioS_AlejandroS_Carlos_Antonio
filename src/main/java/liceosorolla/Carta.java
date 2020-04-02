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
}
