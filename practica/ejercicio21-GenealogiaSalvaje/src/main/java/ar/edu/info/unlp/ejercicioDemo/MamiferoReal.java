package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class MamiferoReal {
	private String id;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;

	public String getIdentificador() {
		return this.id;
	}
	public void setIdentificador(String id) {
		this.id = id;
	}
	public String getEspecie() {
		return this.especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}
	public Mamifero getPadre() {
		return this.padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return this.madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if (madre.getIdentificador().equals(unMamifero.getIdentificador()) || padre.getIdentificador().equals(unMamifero.getIdentificador())) {
			return true;
		}
		else {
			madre.tieneComoAncestroA(unMamifero);
			padre.tieneComoAncestroA(unMamifero);
		}
		return false;
	}
}
