package S301Nivell2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FabricaAbstracta fabrica1D = FabricaProductor.getFactory(1);
		Interface1digito PaisEspa�a = fabrica1D.getDatos1digito("Espa�a");
		System.out.println(PaisEspa�a.getDireccion("valencia", "calle", 123, 8008));
		System.out.println(PaisEspa�a.getTelefono(666333666));

		FabricaAbstracta fabrica2D = FabricaProductor.getFactory(2);
		Interface2digitos PaisEEUU = fabrica2D.getDatos2digitos("EEUU");
		System.out.println(PaisEEUU.getDireccion("Florida", "Street", 12, 80080));
		System.out.println(PaisEEUU.getTelefono(666333666));
		

	}

}
