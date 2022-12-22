package implementation.factory.fullpattern.factory;

import implementation.abstractfactory.DiarioCachorro;
import implementation.factory.model.Cachorro;
import implementation.factory.model.Pug;

public class PugFactory extends CachorroFactory {

	public PugFactory(DiarioCachorro diario) {
		super(diario);		
	}

	@Override
	protected Cachorro instanciaCachorroEspecifico() {
		return new Pug(diario);
	}

}
