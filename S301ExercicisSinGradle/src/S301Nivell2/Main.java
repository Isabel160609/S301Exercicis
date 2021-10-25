package S301Nivell2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FabricaAbstracta fabrica1D = FabricaProductor.getFactory(1);
		Interface1digito PaisEspaña = fabrica1D.getDatos1digito("España");
		System.out.println(PaisEspaña.getDireccion("valencia", "calle", 123, 8008));
		System.out.println(PaisEspaña.getTelefono(666333666));

		FabricaAbstracta fabrica2D = FabricaProductor.getFactory(2);
		Interface2digitos PaisEEUU = fabrica2D.getDatos2digitos("EEUU");
		System.out.println(PaisEEUU.getDireccion("Florida", "Street", 12, 80080));
		System.out.println(PaisEEUU.getTelefono(666333666));
		

	}

}
