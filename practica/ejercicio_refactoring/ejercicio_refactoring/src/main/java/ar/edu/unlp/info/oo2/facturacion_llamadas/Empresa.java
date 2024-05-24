package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	public boolean agregarNumeroTelefono(String numeroTelefono) {
		return guia.agregarNumeroTelefono(numeroTelefono);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}
	
	public Cliente registrarUsuarioFisico(String dni, String nombre) {
		ClienteFisico cliente = new ClienteFisico(nombre, this.obtenerNumeroLibre(), dni);
		agregarUsuario(cliente);
		return cliente;
	}
	
	public Cliente registrarUsuarioJuridico(String cuit, String nombre) {
		ClienteJuridico cliente = new ClienteJuridico(nombre, this.obtenerNumeroLibre(), cuit);
		agregarUsuario(cliente);
		return cliente;
	}
	
	private void agregarUsuario(Cliente cliente) {
		clientes.add(cliente);
	}

	public Llamada registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion) {
		return origen.registrarLlamadaNacional(destino, duracion);
	}
	
	public Llamada registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		return origen.registrarLlamadaInternacional(destino, duracion);
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
