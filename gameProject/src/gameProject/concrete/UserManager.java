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
			System.out.println("Kullanýcý kaydedildi: " + user.getUserFirstName() + " " + user.getUserLastName());
		} else {
			System.out.println("Kullanýcý kaydedilemedi. Kimlik bilgileriniz hatalý.");
		}
	}

	@Override
	public void add(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			super.save(user);
			System.out.println("Kullanýcý eklendi: " + user.getUserFirstName() + " " + user.getUserLastName());
		} else {
			System.out.println("Kullanýcý bilgileri eklenemedi. Daha sonra tekrar deneyin.");
		}
	}

	@Override
	public void delete(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println("Kullanýcý silindi: " + user.getUserFirstName() + " " + user.getUserLastName());
		} else {
			System.out.println("Kullanýcý bilgileri silinemedi. Daha sonra tekrar deneyin.");
		}
	}

	@Override
	public void update(User user) {
		if (userCheckService.checkIfRealUser(user)) {
		System.out.println("Kullanýcý bilgileri güncellendi: " + user.getUserFirstName() + " " + user.getUserLastName());
		}else {
			System.out.println("Kullanýcý bilgileri güncellenemedi. Daha sonra tekrar deneyin.");
		}
	}

}
