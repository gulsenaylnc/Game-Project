package gameProject.abstracts;

import gameProject.entities.User;

public abstract class BaseUserManager implements UserService{

	@Override
	public void save(User user) {
		System.out.println("Veritaban�na kaydedildi: " + user.getUserFirstName() + " " + user.getUserLastName());
	}
}
