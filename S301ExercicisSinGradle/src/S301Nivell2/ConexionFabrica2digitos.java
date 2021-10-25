package S301Nivell2;

public class ConexionFabrica2digitos implements FabricaAbstracta {
	
	@Override
	public Interface1digito getDatos1digito(String pais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interface2digitos getDatos2digitos(String pais) {
		if(pais==null) {
			return new PaisDesconocido ();
		}else if(pais.equalsIgnoreCase("EEUU")) {
			return new ConexionEEUU();
		}else if(pais.equalsIgnoreCase("Rusia")) {
			return new ConexionRusia();
		}else {
			return new PaisDesconocido ();
		}
	}
}
	
