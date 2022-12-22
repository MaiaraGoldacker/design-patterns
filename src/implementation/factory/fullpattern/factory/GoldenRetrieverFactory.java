package implementation.factory.fullpattern.factory;

import implementation.abstractfactory.DiarioCachorro;
import implementation.factory.model.Cachorro;
import implementation.factory.model.GoldenRetriever;

public class GoldenRetrieverFactory extends CachorroFactory {

	public GoldenRetrieverFactory(DiarioCachorro diario) {
		super(diario);		
	}

	@Override
	protected Cachorro instanciaCachorroEspecifico() {
		return new GoldenRetriever(diario);
	}

}
