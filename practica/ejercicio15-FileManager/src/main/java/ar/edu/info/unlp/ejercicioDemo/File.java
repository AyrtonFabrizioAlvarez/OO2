package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class File implements FileOO2{
	private String name;
	private String extension;
	private double size;
	private LocalDate creationDate;
	private LocalDate modificactionDate;
	private String permission;
	
	public File(String name, String extension, double size, LocalDate creation, LocalDate modification, String permission) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.creationDate = creation;
		this.modificactionDate = modification;
		this.permission = permission;
	}

	public String prettyPrint() {
		return "Datos del archivo:\n";
	}

	public String getName() {
		return this.name;
	}

	public String getExtension() {
		return this.extension;
	}
	
	public String getSize() {
		return Double.toString(this.size);
	}

	public String getCreationDate() {
		return this.creationDate.toString();
	}

	public String getModificationDate() {
		return this.modificactionDate.toString();
	}

	public String getPermission() {
		return this.permission;
	}
}
