package ar.edu.info.unlp.ejercicioDemo;

public class NameDecorator extends Decorator{

	public NameDecorator(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getName();
	}
}
