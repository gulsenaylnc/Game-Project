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
			System.out.println("Kullanıcı kaydedildi: " + user.getUserFirstName() + " " + user.getUserLastName());
		} else {
			System.out.println("Kullanıcı kaydedilemedi. Kimlik bilgileriniz hatalı.");
		}
	}

	@Override
	public void add(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			super.save(user);
			System.out.println("Kullanıcı eklendi: " + user.getUserFirstName() + " " + user.getUserLastName());
		} else {
			System.out.println("Kullanıcı bilgileri eklenemedi. Daha sonra tekrar deneyin.");
		}
	}

	@Override
	public void delete(User user) {
		if (userCheckService.checkIfRealUser(user)) {
			System.out.println("Kullanıcı silindi: " + user.getUserFirstName() + " " + user.getUserLastName());
		} else {
			System.out.println("Kullanıcı bilgileri silinemedi. Daha sonra tekrar deneyin.");
		}
	}

	@Override
	public void update(User user) {
		if (userCheckService.checkIfRealUser(user)) {
		System.out.println("Kullanıcı bilgileri güncellendi: " + user.getUserFirstName() + " " + user.getUserLastName());
		}else {
			System.out.println("Kullanıcı bilgileri güncellenemedi. Daha sonra tekrar deneyin.");
		}
	}

}
