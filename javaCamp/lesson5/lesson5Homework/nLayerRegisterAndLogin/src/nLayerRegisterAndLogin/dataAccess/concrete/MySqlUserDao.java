package nLayerRegisterAndLogin.dataAccess.concrete;

import java.util.List;

import nLayerRegisterAndLogin.Entities.concrete.User;
import nLayerRegisterAndLogin.dataAccess.abstracts.UserDao;

public class MySqlUserDao implements UserDao{

	@Override
	public void add(User user) {

		System.out.println("Mq Sql Server : " + user.getFirstName() + ", isimli kullanýcý sisteme baþarýlý bir þekilde eklendi");
	}

	@Override
	public void update(User user) {


		System.out.println("Mq Sql Server : " + user.getFirstName() + ", isimli kullanýcý baþarýlý bir þekilde güncellendi");
	}

	@Override
	public void delete(User user) {


		System.out.println("Mq Sql Server : " + user.getFirstName() + ", isimli kullanýcý sistemden baþarýlý bir þekilde silindi");
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
