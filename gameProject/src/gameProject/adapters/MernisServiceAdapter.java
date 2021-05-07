package gameProject.adapters;

import java.rmi.RemoteException;

import gameProject.abstracts.UserCheckService;
import gameProject.entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{
	
	@Override
	public boolean checkIfRealUser(User user) {

		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getnationalityId()),
					user.getUserFirstName().toUpperCase(), user.getUserLastName().toUpperCase(),
					user.getDateOfBirth().getYear());

		} catch (NumberFormatException e) {
			e.printStackTrace();

		} catch (RemoteException e) {
			e.printStackTrace();

		}
		return result;

	}

}
