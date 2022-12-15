package implementation.factory.main;

import implementation.factory.fullpattern.factory.CachorroFactory;
import implementation.factory.fullpattern.factory.GoldenRetrieverFactory;
import implementation.factory.fullpattern.factory.PequinesFactory;
import implementation.factory.fullpattern.factory.PinscherFactory;
import implementation.factory.fullpattern.factory.PugFactory;

public class FullPatternFactoryMain {

	public static void main(String[] args) {
		
		CachorroFactory goldenRetrieverFactory = new GoldenRetrieverFactory();
		System.out.println("### Cria Golden ###");
		goldenRetrieverFactory.instanciaCachorro();
		
		CachorroFactory pequinesFactory = new PequinesFactory();
		System.out.println("### Cria Pequines ###");
		pequinesFactory.instanciaCachorro();
		
		CachorroFactory pinscherFactory = new PinscherFactory();
		System.out.println("### Cria Pinscher ###");
		pinscherFactory.instanciaCachorro();
		
		CachorroFactory pugFactory = new PugFactory();
		System.out.println("### Cria Pug ###");
		pugFactory.instanciaCachorro();
		
	
	}
}