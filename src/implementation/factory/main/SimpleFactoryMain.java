package implementation.factory.main;
import implementation.abstractfactory.DiarioCachorro;
import implementation.abstractfactory.DiarioCachorroInverno;
import implementation.abstractfactory.DiarioCachorroVerao;
import implementation.factory.simple.factory.CachorroSimpleFactory;

public class SimpleFactoryMain {

	public static void main(String[] args) {
		
		
		DiarioCachorro diario = new DiarioCachorroInverno();
		CachorroSimpleFactory cachorroSimpleFactory = new CachorroSimpleFactory(diario);
		System.out.println("### Cria Golden ###");
		cachorroSimpleFactory.instanciaCachorro("golden");
	
		System.out.println("### Cria Pequines ###");
		cachorroSimpleFactory.instanciaCachorro("pequines");

		System.out.println("### Cria Pinscher ###");
		cachorroSimpleFactory.instanciaCachorro("pinscher");

		System.out.println("### Cria Pug ###");
		cachorroSimpleFactory.instanciaCachorro("pug");
		
	}
}
