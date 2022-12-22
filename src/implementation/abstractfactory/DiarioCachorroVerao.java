package implementation.abstractfactory;

import implementation.abstractfactory.hobby.Hobby;
import implementation.abstractfactory.hobby.HobbyVerao;
import implementation.abstractfactory.roupa.Chapeu;
import implementation.abstractfactory.roupa.ChapeuVerao;

public class DiarioCachorroVerao implements DiarioCachorro {

	@Override
	public Chapeu getChapeu() {
		return new ChapeuVerao();
	}

	@Override
	public Hobby getHobby() {		
		return new HobbyVerao();
	}

}
