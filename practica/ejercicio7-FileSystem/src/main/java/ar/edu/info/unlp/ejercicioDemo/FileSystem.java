package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
	private String nombre;
	private LocalDate fecha;
	
	public FileSystem(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public String getName() {
		return this.nombre;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	/*SI LA IGUALDAD ES POR NOMBRE O IGUALDAD POR NOMRBE Y FECHA
	 * PUEDO HACERLO EN ESTA CLASE PERO ES LA DIFERENCIA ENTRE PREGUNTAR SOLO POR NOMBRE*/
	public boolean sonIguales(String buscado) {
		return this.getName().equals(buscado);
	}
	
//	public abstract boolean igualDirectorio(FileSystem buscado);
//	public abstract boolean igualArchivo(FileSystem buscado);
	
	public abstract Archivo archivoMasGrande();
	public abstract int tamañoTotalOcupado();
	public abstract Archivo archivoMasNuevo();
	public abstract FileSystem buscar(String nombre);
	public abstract List<FileSystem> buscarTodos(String nombre);
	public void buscarTodos(List<FileSystem> lista, String buscado) {
		if (this.sonIguales(buscado)) {
			lista.add(this);
		}
	}

	
}
