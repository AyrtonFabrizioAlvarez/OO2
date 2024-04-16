package ar.edu.info.unlp.ejercicioDemo;

public class Construccion extends Etapa{

	public Construccion(Proyecto proyecto) {
		super(proyecto);
	}
	
	public void aprobarEtapa() {
		if (this.getProyecto().getPrecio() > 0) {
			this.getProyecto().setEtapa(new Evaluacion(this.getProyecto()));			
		} else {
			throw new RuntimeException("No se puede pasar a evaluacion un proyecto de precio 0");
		}
	};
	
	public void modificarMargen(double margen) {
		if ( (margen >=8) && (margen <= 10) ) {
			this.getProyecto().setGanancia(margen);
		}
	};
}
