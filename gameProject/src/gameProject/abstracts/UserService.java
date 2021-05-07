package gameProject.abstracts;

import gameProject.entities.User;

public interface UserService {
	
	void save(User user);
	void add(User user);
	void delete(User user);
	void update(User user);

}
