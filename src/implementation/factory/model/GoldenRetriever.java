package implementation.factory.model;

import implementation.abstractfactory.DiarioCachorro;

public class GoldenRetriever extends Cachorro {

	public GoldenRetriever(DiarioCachorro diario) {
		super(diario);		
	}

	@Override
	public void getCaracteristicasEspecificas() {
		System.out.println("Características Golden Retriever ");
		System.out.println("1 - Focinho longo");
		System.out.println("2 - Pelos dourados médio");
		System.out.println("3 - Grande Porte");
		System.out.println("4 - Dócil");
		System.out.println("5 - Gosta de brincar");	
	}

}
