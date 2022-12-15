package implementation.factory.model;

public class Pinscher extends Cachorro {

	@Override
	public void getCaracteristicasEspecificas() {
		System.out.println("Características Pinscher ");
		System.out.println("1 - Focinho longo");
		System.out.println("2 - Pelos curtos");
		System.out.println("3 - Pequeno Porte");
		System.out.println("4 - Instável");
		System.out.println("5 - Gosta de dormir");		
	}

}
