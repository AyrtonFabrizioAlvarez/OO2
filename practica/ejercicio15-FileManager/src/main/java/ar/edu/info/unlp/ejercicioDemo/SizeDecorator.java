package ar.edu.info.unlp.ejercicioDemo;

public class SizeDecorator extends Decorator{

	public SizeDecorator(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getSize() + " MB";
	}
}
