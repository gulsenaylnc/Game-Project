package gameProject.concrete;

import gameProject.abstracts.BaseUserManager;
import gameProject.abstracts.UserCheckService;
import gameProject.abstracts.UserService;
import gameProject.entities.User;

public class UserManager extends BaseUserManager implements UserService {

	UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void save(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println("Kullan�c� kaydedildi: " + user.getUserFirstName() + " " + user.getUserLastName());
		} else {
			System.out.println("Kullan�c� kaydedilemedi. Kimlik bilgileriniz hatal�.");
		}
	}

	@Override
	public void add(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			super.save(user);
			System.out.println("Kullan�c� eklendi: " + user.getUserFirstName() + " " + user.getUserLastName());
		} else {
			System.out.println("Kullan�c� bilgileri eklenemedi. Daha sonra tekrar deneyin.");
		}
	}

	@Override
	public void delete(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println("Kullan�c� silindi: " + user.getUserFirstName() + " " + user.getUserLastName());
		} else {
			System.out.println("Kullan�c� bilgileri silinemedi. Daha sonra tekrar deneyin.");
		}
	}

	@Override
	public void update(User user) {
		if (userCheckService.checkIfRealUser(user)) {
		System.out.println("Kullan�c� bilgileri g�ncellendi: " + user.getUserFirstName() + " " + user.getUserLastName());
		}else {
			System.out.println("Kullan�c� bilgileri g�ncellenemedi. Daha sonra tekrar deneyin.");
		}
	}

}
