package S301Nivell2;

public class FabricaProductor {

	public static FabricaAbstracta getFactory(int tipoFabrica) {

		if (tipoFabrica==1) {
			return new ConexionFabrica1digito();

		} else if (tipoFabrica==2) {
			return new ConexionFabrica2digitos();
		}

		return null;
	}
}
