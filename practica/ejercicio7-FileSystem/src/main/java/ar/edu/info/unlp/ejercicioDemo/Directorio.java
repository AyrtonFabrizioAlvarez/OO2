package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends FileSystem{
	
	private ArrayList<FileSystem> archivos;

	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
		this.archivos = new ArrayList<FileSystem>();
	};
	
	public void agregarArchivo(FileSystem archivo) {
		this.archivos.add(archivo);
	};
	
	public void eliminarArchivo(FileSystem archivo) {
		if (!this.archivos.isEmpty()) {
			this.archivos.remove(archivo);			
		}
	};
	
	public Archivo archivoMasGrande() {
		return this.archivos.stream().map(archivo -> archivo.archivoMasGrande()).max((a1, a2) -> Integer.compare(a1.tamañoTotalOcupado(), a2.tamañoTotalOcupado())).orElse(null);
	};
	
	public Archivo archivoMasNuevo() {
		return this.archivos.stream().map(archivo -> archivo.archivoMasNuevo()).max((a1, a2) -> a1.getFecha().compareTo(a2.getFecha())).orElse(null);
	};
	
	public int tamañoTotalOcupado() {
		return this.archivos.stream().mapToInt(archivo -> archivo.tamañoTotalOcupado()).sum();
	};
	
	public FileSystem buscar(String nombre) {
		if (this.sonIguales(nombre)) {
			return this;
		}
		return this.archivos.stream().filter(a -> (a.buscar(nombre) != null)).findFirst().orElse(null);		
	};
	
	public List<FileSystem> buscarTodos(String nombre){
		ArrayList<FileSystem> listaBuscados = new ArrayList<FileSystem>();
		this.archivos.stream().forEach(a -> a.buscarTodos(listaBuscados, nombre));	
		return listaBuscados;
	};
	

}
