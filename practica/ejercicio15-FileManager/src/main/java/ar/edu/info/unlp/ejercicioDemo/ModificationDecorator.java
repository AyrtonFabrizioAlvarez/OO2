package ar.edu.info.unlp.ejercicioDemo;

public class ModificationDecorator extends Decorator{

	public ModificationDecorator(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getModificationDate();
	}
}
