package ar.edu.info.unlp.ejercicioDemo;

public class PermissionDecorator extends Decorator{
	
	public PermissionDecorator(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getPermission();
	}
}
