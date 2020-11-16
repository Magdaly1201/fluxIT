package ar.com.fluxit.candidates.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.com.fluxit.candidates.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long>{

	Optional<User> findByUsernameAndPassword(String username, String password);
	
}
