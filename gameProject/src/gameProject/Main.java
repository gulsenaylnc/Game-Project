package gameProject;

import java.util.Date;

import gameProject.adapters.MernisServiceAdapter;
import gameProject.concrete.CampaignManager;
import gameProject.concrete.GameManager;
import gameProject.concrete.SaleManager;
import gameProject.concrete.UserManager;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.User;

public class Main {

	public static void main(String[] args) {

		User user = new User("43465932714", "Gülsena", "Yýlancý", new Date(1996, 9, 13));
		Game game = new Game(1, "Valorant", 65);
		Game game2 = new Game(2, "Forest", 80);
		Game game3 = new Game(3, "Rust", 130);
		Campaign campaign = new Campaign(1, "Yýlbaþý indirimi", 50);
		Campaign campaign2 = new Campaign(2, "Kara Cuma Ýndirimi", 30);

		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user);
		userManager.update(user);
		userManager.delete(user);
		System.out.println("----------------------------------------------------------");

		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game2);
		System.out.println("----------------------------------------------------------");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign2);
		System.out.println("----------------------------------------------------------");

		SaleManager saleManager = new SaleManager();
		saleManager.buy(user, game);
		saleManager.campaignBuy(user, game2, campaign);
		saleManager.campaignBuy(user, game3, campaign2);
		saleManager.restitute(user, game2);

	}

}
