package ar.edu.info.unlp.ejercicioDemo;

public class CreationDecorator extends Decorator{
	
	public CreationDecorator(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getCreationDate();
	}
}
