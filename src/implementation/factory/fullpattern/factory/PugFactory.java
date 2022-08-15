package implementation.factory.fullpattern.factory;

import implementation.factory.model.Cachorro;
import implementation.factory.model.Pug;

public class PugFactory extends CachorroFactory {

	@Override
	protected Cachorro instanciaCachorroEspecifico() {
		return new Pug();
	}

}
