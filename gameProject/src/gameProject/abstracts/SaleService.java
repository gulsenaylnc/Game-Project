package gameProject.abstracts;

import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.User;

public interface SaleService {
	
	void buy(User user, Game game);
	void campaignBuy(User user, Game game, Campaign campaign);
	void restitute(User user, Game game);

}
