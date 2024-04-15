package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends FileSystem{

	private int tamanio;
	
	public Archivo(String nombre, LocalDate fecha, int tamanio) {
		super(nombre, fecha);
		this.tamanio = tamanio;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	};
	
	public int tamañoTotalOcupado() {
		return this.tamanio;
	};
	
	public Archivo archivoMasNuevo() {
		return this;
	};
	
	public FileSystem buscar(String nombre) {
		FileSystem buscado = null;
		if (this.getName().equals(nombre)) {
			buscado = this;
		}
		return buscado;
	};
	
	public List<FileSystem> buscarTodos(String nombre){
		return null;
	};
	
}
