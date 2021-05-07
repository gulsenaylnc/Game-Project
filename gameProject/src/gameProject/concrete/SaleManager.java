package gameProject.concrete;

import gameProject.abstracts.SaleService;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.User;

public class SaleManager implements SaleService{

	@Override
	public void buy(User user, Game game) {
		System.out.println(user.getUserFirstName() + " " + user.getUserLastName() 
		+ " adlý kullanýcý " + game.getName() + " oyununu " + game.getPrice() + " TL ödeyerek satýn aldý."  );
		
	}

	@Override
	public void campaignBuy(User user, Game game, Campaign campaign) {
		System.out.println(user.getUserFirstName() + " " + user.getUserLastName() 
		+ " adlý kullanýcý " + game.getName() + " oyununu " + campaign.getName() + "'yle " 
				+ (game.getPrice()-((game.getPrice()*campaign.getDiscount())/100)) + " TL ödeyerek satýn aldý.");
		
	}

	@Override
	public void restitute(User user, Game game) {
		System.out.println(user.getUserFirstName() + " " + user.getUserLastName() + " adlý kullanýcý " + game.getName() + " oyununu iade etti.");
		
	}

	

}
