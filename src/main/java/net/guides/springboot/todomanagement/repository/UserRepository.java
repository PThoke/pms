package net.guides.springboot.todomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import net.guides.springboot.todomanagement.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	/* Optional<User> findUserByEmailId(String emailId); */
    //@Query("SELECT u FROM User u WHERE u.username = :username")
	/* User getUserByUsername(@Param("username") String username); */
    User getUserByUsername(String username);
}
