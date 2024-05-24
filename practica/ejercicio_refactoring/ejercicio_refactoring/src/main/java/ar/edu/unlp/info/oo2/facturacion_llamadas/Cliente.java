package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	public Llamada registrarLlamadaNacional(Cliente destino, int duracion) {
		Llamada llamada = new LlamadaNacional(getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		agregarLlamada(llamada);
		return llamada;
	}

	public Llamada registrarLlamadaInternacional(Cliente destino, int duracion) {
		Llamada llamada = new LlamadaInternacional(getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		agregarLlamada(llamada);
		return llamada;
	}
	
	private void agregarLlamada(Llamada llamada) {
		llamadas.add(llamada);
	}
	
	public double calcularMontoTotalLlamadas() {
		return llamadas.stream()
				.mapToDouble(l -> l.calcularPrecioLlamada())
				.map(precio -> aplicarDescuento(precio))
				.sum();
	}
	
	protected abstract double aplicarDescuento(double precio);
	
	
}
