package ar.edu.info.unlp.ejercicioDemo;

public class Evaluacion extends Etapa{
	
	public Evaluacion(Proyecto proyecto) {
		super(proyecto);
	}
	
	public void aprobarEtapa() {
		this.getProyecto().setEtapa(new Confirmada(this.getProyecto()));
	};
	public void modificarMargen(double margen) {
		if ( (margen >=11) && (margen <= 15) ) {
			this.getProyecto().setGanancia(margen);
		}
	};
}
