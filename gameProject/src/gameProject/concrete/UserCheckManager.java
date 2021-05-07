package gameProject.concrete;

import gameProject.abstracts.UserCheckService;
import gameProject.entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealUser(User user) {
		
		return true;
	}
	

}
