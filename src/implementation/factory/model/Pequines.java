package implementation.factory.model;

import implementation.abstractfactory.DiarioCachorro;

public class Pequines extends Cachorro {

	public Pequines(DiarioCachorro diario) {
		super(diario);
	}

	@Override
	public void getCaracteristicasEspecificas() {
		System.out.println("Características Pequines ");
		System.out.println("1 - Focinho achatado");
		System.out.println("2 - Pelos médios");
		System.out.println("3 - Pequeno Porte");
		System.out.println("4 - Dócil");
		System.out.println("5 - Gosta de brincar");
	}

}
