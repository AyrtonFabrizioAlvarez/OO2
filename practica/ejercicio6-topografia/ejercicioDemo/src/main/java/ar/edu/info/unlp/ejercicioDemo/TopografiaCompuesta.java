package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class TopografiaCompuesta extends Topografia{
	private ArrayList<Topografia> topografias;
	
	public TopografiaCompuesta (Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.topografias = new ArrayList<Topografia>();
		this.topografias.add(t1);
		this.topografias.add(t2);
		this.topografias.add(t3);
		this.topografias.add(t4);
	}
	
	public double calcularProporcionAgua() {
		double resultado = this.topografias.stream().mapToDouble(t -> t.calcularProporcionAgua()).sum();
		return resultado / 4;
	}
	
	public ArrayList<Topografia> getTopografias(){
		return this.topografias;
	}

	protected boolean equalsToMixta(TopografiaCompuesta mixta) {
		return this.topografias.equals(mixta.getTopografias());
	}
	@Override
	public boolean sonTopografiasIguales(Topografia topografia) {
		return topografia.equalsToMixta(this);
		
	}
}
