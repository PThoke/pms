package net.guides.springboot.todomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.guides.springboot.todomanagement.model.UserPolicyMapping;

public interface PolicyUserRepository extends JpaRepository<UserPolicyMapping, Integer> {

}
