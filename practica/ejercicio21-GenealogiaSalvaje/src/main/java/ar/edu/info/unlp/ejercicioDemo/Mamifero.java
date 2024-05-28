package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface Mamifero {

	public String getIdentificador();
	public String setIdentificador(String id);
	public String getEspecie();
	public String setEspecie(String especie);
	public LocalDate getFechaNacimiento();
	public void setFechaNacimiento(LocalDate fecha);
	public Mamifero getPadre();
	public void setPadre(Mamifero padre);
	public Mamifero getMadre();
	public void setMadre(Mamifero madre);
	public Mamifero getAbueloMaterno();
	public Mamifero getAbuelaMaterna();
	public Mamifero getAbueloPaterno();
	public Mamifero getAbuelaPaterna();
	public boolean tieneComoAncestroA(Mamifero unMamifero);


}
