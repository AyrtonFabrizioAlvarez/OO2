package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Decorator implements FileOO2{
	private FileOO2 component;
	
	public Decorator(FileOO2 component) {
		this.component = component;
	}
	
	public String prettyPrint() {
		return this.component.prettyPrint() + " ";
	}

	public String getName() {
		return this.component.getName();
	}

	public String getExtension() {
		return this.component.getExtension();
	}
	
	public String getSize() {
		return this.component.getSize();
	}

	public String getCreationDate() {
		return this.component.getCreationDate();
	}

	public String getModificationDate() {
		return this.component.getModificationDate();
	}

	public String getPermission() {
		return this.component.getPermission();
	}
	
	
}
