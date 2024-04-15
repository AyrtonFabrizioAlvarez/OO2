package ar.edu.info.unlp.ejercicioDemo;

public class Provisoria extends Estado{

	public Provisoria(Excursion excursion) {
		super(excursion);
	}
	
	
	//PREGUNTAR SI NO REPITO CODIGO (SOLO CAMBIA QUE ACA COMPARO CON MINIMO Y NO MAXIMO)
	public void inscribir(Usuario usuario) {
		Excursion excursion = this.getExcursion();
		excursion.getInscriptos().add(usuario);			
		if (excursion.alcanzoCupoMinimo()) {
			excursion.setEstado(new Definitiva(excursion));
			//DEBERIA HACER ALGO MAS? DICE AL ALCANZAR EL CUPO
			//MINIMO SE CONSIDERA DEFINITIVA Y "PODRA LLEVARSE A CABO" O SOLO ES ALGO PARA CONTEXTUALIZAR
		}
	}
	
	public String obtenerInformacion() {
		return this.getExcursion().obtenerInformacion() + "\n"
				+ "lugares restantes para el cupo minimo: " + (this.getExcursion().getCupoMinimo() - this.getExcursion().getInscriptos().size());
	}
}
