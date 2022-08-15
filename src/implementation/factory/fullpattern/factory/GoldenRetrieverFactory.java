package implementation.factory.fullpattern.factory;

import implementation.factory.model.Cachorro;
import implementation.factory.model.GoldenRetriever;

public class GoldenRetrieverFactory extends CachorroFactory {

	@Override
	protected Cachorro instanciaCachorroEspecifico() {
		return new GoldenRetriever();
	}

}
