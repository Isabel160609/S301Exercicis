package s301Nivell3;

public class Avio extends Vehicle{
	private String marca;
	
	
	public Avio(String marca) {
		super(marca);
		
	}
	@Override
	public void arrancar() {
		System.out.println("el avion "+ super.marca+" despega");
		
	}
	@Override
	public void acelerar() {
		System.out.println("el avion "+ super.marca+"  acelera");
		
	}
	@Override
	public void frenar() {
		System.out.println("el avion "+ super.marca+"  frena");
		
	}

}
