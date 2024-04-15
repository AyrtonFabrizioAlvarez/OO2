package ar.edu.info.unlp.ejercicioDemo;

public abstract class Estado {
	private Excursion excursion;
	
	public Estado(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public Excursion getExcursion() {
		return this.excursion;
	}

	public abstract void inscribir(Usuario usuario);
	public abstract String obtenerInformacion();
}
