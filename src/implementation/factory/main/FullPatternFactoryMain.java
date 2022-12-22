package implementation.factory.main;

import implementation.abstractfactory.DiarioCachorro;
import implementation.abstractfactory.DiarioCachorroVerao;
import implementation.factory.fullpattern.factory.CachorroFactory;
import implementation.factory.fullpattern.factory.GoldenRetrieverFactory;
import implementation.factory.fullpattern.factory.PequinesFactory;
import implementation.factory.fullpattern.factory.PinscherFactory;
import implementation.factory.fullpattern.factory.PugFactory;

public class FullPatternFactoryMain {

	public static void main(String[] args) {
		

		DiarioCachorro diario = new DiarioCachorroVerao();
		
		CachorroFactory goldenRetrieverFactory = new GoldenRetrieverFactory(diario);
		System.out.println("### Cria Golden ###");
		goldenRetrieverFactory.instanciaCachorro();
		
		CachorroFactory pequinesFactory = new PequinesFactory(diario);
		System.out.println("### Cria Pequines ###");
		pequinesFactory.instanciaCachorro();
		
		CachorroFactory pinscherFactory = new PinscherFactory(diario);
		System.out.println("### Cria Pinscher ###");
		pinscherFactory.instanciaCachorro();
		
		CachorroFactory pugFactory = new PugFactory(diario);
		System.out.println("### Cria Pug ###");
		pugFactory.instanciaCachorro();

	
	}
}