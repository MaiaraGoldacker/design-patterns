package implementation.factory.simple.factory;

import java.util.Objects;

import implementation.factory.model.Cachorro;
import implementation.factory.model.GoldenRetriever;
import implementation.factory.model.Pequines;
import implementation.factory.model.Pinscher;
import implementation.factory.model.Pug;

public class CachorroSimpleFactory {
	
	public static Cachorro instanciaCachorro(String racaCachorro) {
		Cachorro cachorro = null;
		
		if ("pug".equalsIgnoreCase(racaCachorro)) {
			cachorro = new Pug();
		} else if ("pequines".equalsIgnoreCase(racaCachorro)) {
			cachorro = new Pequines();
		} else if ("golden".equalsIgnoreCase(racaCachorro)) {
			cachorro = new GoldenRetriever();
		} else if ("pinscher".equalsIgnoreCase(racaCachorro)) {
			cachorro = new Pinscher();
		}
		
		if (Objects.nonNull(cachorro)) {
			cachorro.quantidadeOrelhas();
			cachorro.som();
			cachorro.quantidadePatas();	
			cachorro.getCaracteristicasEspecificas();
		}
		
		return cachorro;
	}

}
