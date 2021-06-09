package kodlamaio.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{

	//User getByEmail(String email); 	//ilk kullanım
	User findByEmail(String email);		//ikinci kullanım
}
