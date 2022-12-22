package implementation.factory.model;

import implementation.abstractfactory.DiarioCachorro;

public abstract class Cachorro {
	
	DiarioCachorro diario;
	
	public Cachorro(DiarioCachorro diario) {
		this.diario = diario;
	}
	
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

	//abstract factory		
	public void hobby() {
		System.out.println(diario.getHobby().hobbyPreferido());
	}
	
	public void chapeu() {
		System.out.println(diario.getChapeu().tipoChapeu());
	}
}
