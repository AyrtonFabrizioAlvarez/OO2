package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectorioTest {
	
	Directorio directorioVacio;
	Directorio directorioConUnArchivo;
	Directorio directorioConVariosArchivos;
	Directorio directorioConDirectorios;
	Archivo arch1, arch2, arch3;
	
	@BeforeEach
	void setUp() throws Exception {
		
		directorioVacio = new Directorio("directorioVacio", LocalDate.now());
		directorioConUnArchivo = new Directorio("directorioConUnArchivo", LocalDate.now());
		directorioConVariosArchivos = new Directorio("directorioConVariosArchivos", LocalDate.now());
		directorioConDirectorios = new Directorio("directorioConDirectorios", LocalDate.now());
		arch1 = new Archivo("archivo1", LocalDate.of(2024, 4, 1), 32);
		arch2 = new Archivo("archivo2", LocalDate.now(), 64);
		arch3 = new Archivo("archivo3", LocalDate.now(), 128);
		
		
		directorioConUnArchivo.agregarArchivo(arch1);
		
		directorioConVariosArchivos.agregarArchivo(arch1);
		directorioConVariosArchivos.agregarArchivo(arch2);
		directorioConVariosArchivos.agregarArchivo(arch3);
		directorioConVariosArchivos.agregarArchivo(arch3);
		
		directorioConDirectorios.agregarArchivo(arch1);
		directorioConDirectorios.agregarArchivo(arch2);
		directorioConDirectorios.agregarArchivo(arch3);
		directorioConDirectorios.agregarArchivo(directorioVacio);
		directorioConDirectorios.agregarArchivo(directorioConUnArchivo);
		directorioConDirectorios.agregarArchivo(directorioConUnArchivo);
		
		
	}
	
    @Test
    public void testTamañoTotalOcupado() {
       assertEquals(0, directorioVacio.tamañoTotalOcupado());
       assertEquals(32, directorioConUnArchivo.tamañoTotalOcupado());
       assertEquals(352, directorioConVariosArchivos.tamañoTotalOcupado());
       assertEquals(288, directorioConDirectorios.tamañoTotalOcupado());
    }
    
    @Test
    public void testArchivoMasNuevo() {
        assertEquals(null, directorioVacio.archivoMasNuevo());
        assertEquals(arch1, directorioConUnArchivo.archivoMasNuevo());
        assertEquals(arch2, directorioConVariosArchivos.archivoMasNuevo());
//        assertEquals(arch1, directorioConDirectorios.archivoMasNuevo());  CONSULTAR POR STREAM 
    }
    
    @Test
    public void testArchivoMasGrande() {
    	assertEquals(null, directorioVacio.archivoMasGrande());
        assertEquals(arch1, directorioConUnArchivo.archivoMasGrande());
        assertEquals(arch3, directorioConVariosArchivos.archivoMasGrande());
       // assertEquals(arch1, directorioConDirectorios.archivoMasGrande());  
    }
    
    @Test
    public void testBuscar() {
    	assertEquals(null, directorioVacio.buscar("archivo1"));
        assertEquals(arch1, directorioConUnArchivo.buscar("archivo1"));
        assertEquals(arch3, directorioConVariosArchivos.buscar("archivo3"));
        assertEquals(directorioVacio, directorioConDirectorios.buscar("directorioVacio"));  
        assertEquals(null, directorioConDirectorios.buscar("noExiste"));
    }
    
    @Test
    public void testBuscarTodos() {
    	assertEquals(new ArrayList<>(), directorioVacio.buscarTodos("archivo1"));
    	
    	ArrayList<FileSystem> listaUnArchivo = new ArrayList<FileSystem>();
    	listaUnArchivo.add(arch1);
    	assertEquals(listaUnArchivo, directorioConUnArchivo.buscarTodos("archivo1"));
    	
    	ArrayList<FileSystem> listaVariosArchivos = new ArrayList<FileSystem>();
    	listaVariosArchivos.add(arch3);
    	listaVariosArchivos.add(arch3);
    	assertEquals(listaVariosArchivos, directorioConVariosArchivos.buscarTodos("archivo3"));
    	
    	ArrayList<FileSystem> listaConDirectorios = new ArrayList<FileSystem>();
    	listaConDirectorios.add(directorioConUnArchivo);
    	listaConDirectorios.add(directorioConUnArchivo);
    	
        assertEquals(listaConDirectorios, directorioConDirectorios.buscarTodos("directorioConUnArchivo"));  
        
        assertEquals(new ArrayList<>(), directorioConDirectorios.buscarTodos("noExiste"));
    }
    }
