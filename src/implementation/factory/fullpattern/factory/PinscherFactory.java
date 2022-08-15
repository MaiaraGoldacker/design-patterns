package implementation.factory.fullpattern.factory;

import implementation.factory.model.Cachorro;
import implementation.factory.model.Pinscher;

public class PinscherFactory extends CachorroFactory {

	@Override
	protected Cachorro instanciaCachorroEspecifico() {
		return new Pinscher();
	}

}
