package net.guides.springboot.todomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import net.guides.springboot.todomanagement.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer>{
	
	@Modifying
	@Query(value = "insert into user_policy_mapping (user_id, policy_id) VALUES (?1, ?2)", nativeQuery = true)
	int savePolicy(int policyId, int userId);

}
