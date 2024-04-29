package ar.edu.info.unlp.ejercicioDemo;

public class ExtensionDecorator extends Decorator{

	public ExtensionDecorator(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension();
	}
}
