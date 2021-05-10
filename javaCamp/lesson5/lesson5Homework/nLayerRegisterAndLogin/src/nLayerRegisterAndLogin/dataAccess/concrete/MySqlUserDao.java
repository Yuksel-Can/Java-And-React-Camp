package nLayerRegisterAndLogin.dataAccess.concrete;

import java.util.List;

import nLayerRegisterAndLogin.Entities.concrete.User;
import nLayerRegisterAndLogin.dataAccess.abstracts.UserDao;

public class MySqlUserDao implements UserDao{

	@Override
	public void add(User user) {

		System.out.println("Mq Sql Server : " + user.getFirstName() + ", isimli kullan�c� sisteme ba�ar�l� bir �ekilde eklendi");
	}

	@Override
	public void update(User user) {


		System.out.println("Mq Sql Server : " + user.getFirstName() + ", isimli kullan�c� ba�ar�l� bir �ekilde g�ncellendi");
	}

	@Override
	public void delete(User user) {


		System.out.println("Mq Sql Server : " + user.getFirstName() + ", isimli kullan�c� sistemden ba�ar�l� bir �ekilde silindi");
	}

	@Override
	public User getUser(int id) {

		return null;
	}

	@Override
	public List<User> getAll() {

		return null;
	}

}
