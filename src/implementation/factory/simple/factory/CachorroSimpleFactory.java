package implementation.factory.simple.factory;

import java.util.Objects;

import implementation.abstractfactory.DiarioCachorro;
import implementation.factory.model.Cachorro;
import implementation.factory.model.GoldenRetriever;
import implementation.factory.model.Pequines;
import implementation.factory.model.Pinscher;
import implementation.factory.model.Pug;

public class CachorroSimpleFactory {
	
	DiarioCachorro diario;
	
	public CachorroSimpleFactory(DiarioCachorro diario) {
		this.diario = diario;
	}
	
	public  Cachorro instanciaCachorro(String racaCachorro) { //removi o static da classe instanciaCachorro porque agora adicionei um abstract factory,
														      //então esse meu método acaba dependendo de uma instância em tempo de execução.
		Cachorro cachorro = null;
		
		if ("pug".equalsIgnoreCase(racaCachorro)) {
			cachorro = new Pug(diario);
		} else if ("pequines".equalsIgnoreCase(racaCachorro)) {
			cachorro = new Pequines(diario);
		} else if ("golden".equalsIgnoreCase(racaCachorro)) {
			cachorro = new GoldenRetriever(diario);
		} else if ("pinscher".equalsIgnoreCase(racaCachorro)) {
			cachorro = new Pinscher(diario);
		}
		
		if (Objects.nonNull(cachorro)) {
			cachorro.quantidadeOrelhas();
			cachorro.som();
			cachorro.quantidadePatas();	
			cachorro.getCaracteristicasEspecificas();
			
			cachorro.hobby();
			cachorro.chapeu();
		}
		
		return cachorro;
	}

}
