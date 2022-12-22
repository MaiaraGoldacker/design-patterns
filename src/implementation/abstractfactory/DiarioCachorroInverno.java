package implementation.abstractfactory;

import implementation.abstractfactory.hobby.Hobby;
import implementation.abstractfactory.hobby.HobbyInverno;
import implementation.abstractfactory.roupa.Chapeu;
import implementation.abstractfactory.roupa.ChapeuInverno;

public class DiarioCachorroInverno implements DiarioCachorro {

	@Override
	public Chapeu getChapeu() {
		return new ChapeuInverno();
	}

	@Override
	public Hobby getHobby() {	
		return new HobbyInverno();
	}	
	
}
