package implementation.factory.model;

public abstract class Cachorro {
	
	public abstract void getCaracteristicasEspecificas();
	
	//todo o cachorro vai ter essas características específicas
	public void quantidadePatas() {
		System.out.println("quatro patas");
	}

	public void som() {
		System.out.println("latidos");
	}

	public void quantidadeOrelhas() {
		System.out.println("duas orelhas");
	}

}
