package implementation.factory.fullpattern.factory;

import implementation.abstractfactory.DiarioCachorro;
import implementation.factory.model.Cachorro;

public abstract class CachorroFactory {
	
	DiarioCachorro diario;
	
	//Preciso desse construtor na Factory, pois é ele que passa a instância para dentro de Cachorro e cachorro de raças específicas
	public CachorroFactory(DiarioCachorro diario) {
		this.diario = diario;
	}
	
	public Cachorro instanciaCachorro() {
		
		Cachorro cachorro = instanciaCachorroEspecifico();

		cachorro.quantidadeOrelhas();
		cachorro.som();
		cachorro.quantidadePatas();
	
		cachorro.getCaracteristicasEspecificas();
		
		//abstract factory
		cachorro.hobby();
		cachorro.chapeu();
		
		return cachorro;
	}
	
	protected abstract Cachorro instanciaCachorroEspecifico();

}
