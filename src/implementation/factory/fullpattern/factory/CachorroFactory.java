package implementation.factory.fullpattern.factory;

import implementation.factory.model.Cachorro;

public abstract class CachorroFactory {
	
	public Cachorro instanciaCachorro() {
		Cachorro cachorro = instanciaCachorroEspecifico();

		cachorro.quantidadeOrelhas();
		cachorro.som();
		cachorro.quantidadePatas();
	
		cachorro.getCachorro();
		
		return cachorro;
	}
	
	protected abstract Cachorro instanciaCachorroEspecifico();

}
