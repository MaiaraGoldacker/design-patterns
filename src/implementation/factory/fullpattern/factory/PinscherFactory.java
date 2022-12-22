package implementation.factory.fullpattern.factory;

import implementation.abstractfactory.DiarioCachorro;
import implementation.factory.model.Cachorro;
import implementation.factory.model.Pinscher;

public class PinscherFactory extends CachorroFactory {

	public PinscherFactory(DiarioCachorro diario) {
		super(diario);		
	}

	@Override
	protected Cachorro instanciaCachorroEspecifico() {
		return new Pinscher(diario);
	}

}
