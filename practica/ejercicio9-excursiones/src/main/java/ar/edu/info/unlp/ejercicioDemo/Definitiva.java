package ar.edu.info.unlp.ejercicioDemo;

public class Definitiva extends Estado{

	public Definitiva(Excursion excursion){
		super(excursion);
	}
	
	
	//PREGUNTAR SI NO REPITO CODIGO (SOLO CAMBIA QUE ACA COMPARO CON MAXIMO Y NO CON MINIMO)
	public void inscribir(Usuario usuario) {
		Excursion excursion = this.getExcursion();
		excursion.getInscriptos().add(usuario);			
		//PREGUNTO SI DESPUES DE AGREGAR ALCANCE EL MAXIMO Y LO PASO A COMPLETA
		if (excursion.alcanzoCupoMaximo()) {
			excursion.setEstado(new Completa(excursion));
		}
	}
	
	public String obtenerInformacion() {
		return this.getExcursion().obtenerInformacion() + "\n"
				+ "Contacto inscriptos : " + "\n"
				+ this.getExcursion().getEmails()
				+ "Lugares restantes para el cupo maximo : " + (this.getExcursion().getCupoMaximo() - this.getExcursion().getInscriptos().size());
	}
}
