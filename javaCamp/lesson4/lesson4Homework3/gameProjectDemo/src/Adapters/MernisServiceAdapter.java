package Adapters;

import java.rmi.RemoteException;

import Abstracts.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) throws NumberFormatException, RemoteException {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName(), user.getLastName(), Integer.parseInt(user.getDateOfBirth()));
		
	}

}
