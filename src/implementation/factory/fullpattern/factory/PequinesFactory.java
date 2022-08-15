package implementation.factory.fullpattern.factory;

import implementation.factory.model.Cachorro;
import implementation.factory.model.Pequines;

public class PequinesFactory extends CachorroFactory {

	@Override
	protected Cachorro instanciaCachorroEspecifico() {
		return new Pequines();
	}

}
