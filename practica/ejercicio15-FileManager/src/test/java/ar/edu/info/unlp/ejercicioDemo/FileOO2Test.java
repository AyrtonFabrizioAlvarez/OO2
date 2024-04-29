package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileOO2Test {
	FileOO2 file;
	FileOO2 name;
	FileOO2 extension;
	FileOO2 size;
	FileOO2 dateCreated;
	FileOO2 dateModified;
	FileOO2 permissions;
	
	@BeforeEach
	void setUp() throws Exception {
		this.file = new File ("The Next Best American Record", ".mp3", 10.5, LocalDate.of(2019, 8, 30), LocalDate.of(2019, 8, 30), "rwxr-xr-x");
		
	}

	@Test
	void testPrettyPrintOption1() { 
		//name - extension
		this.name = new NameDecorator(file);  
		this.extension = new ExtensionDecorator(name);
		
		assertEquals("Datos del archivo:\n The Next Best American Record .mp3",this.extension.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption2() { 
		//name - extension - date created
		this.name = new NameDecorator(file);  
		this.extension = new ExtensionDecorator(name);
		this.dateCreated = new CreationDecorator(extension);
		
		assertEquals("Datos del archivo:\n The Next Best American Record .mp3 2019-08-30",this.dateCreated.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption3() { 
		//permissions - name - extension - size
		this.permissions = new PermissionDecorator(file);  
		this.name = new NameDecorator(permissions);
		this.extension = new ExtensionDecorator(name);
		this.size = new SizeDecorator(extension);
		
		assertEquals("Datos del archivo:\n rwxr-xr-x The Next Best American Record .mp3 10.5 MB",this.size.prettyPrint());
	}

}
