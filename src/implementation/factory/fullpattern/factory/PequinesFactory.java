package implementation.factory.fullpattern.factory;

import implementation.abstractfactory.DiarioCachorro;
import implementation.factory.model.Cachorro;
import implementation.factory.model.Pequines;

public class PequinesFactory extends CachorroFactory {

	public PequinesFactory(DiarioCachorro diario) {
		super(diario);		
	}

	@Override
	protected Cachorro instanciaCachorroEspecifico() {
		return new Pequines(diario);
	}

}
