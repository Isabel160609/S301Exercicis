package S301Nivell2;

public class ConexionFabrica1digito implements FabricaAbstracta{

	@Override
	public Interface1digito getDatos1digito(String pais) {
		if(pais==null) {
			return new PaisDesconocido ();
		}else if(pais.equalsIgnoreCase("Espa�a")) {
			return new ContactoEspa�ol();
		}else if(pais.equalsIgnoreCase("Francia")) {
			return new ContactoFrances();
		}else {
			return new PaisDesconocido (); 
		}
	}

	@Override
	public Interface2digitos getDatos2digitos(String pais) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
