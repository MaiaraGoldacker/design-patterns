package implementation.factory.main;
import implementation.factory.simple.factory.CachorroSimpleFactory;

public class SimpleFactoryMain {

	public static void main(String[] args) {
		CachorroSimpleFactory cachorroSimpleFactory = new CachorroSimpleFactory();
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
