package net.guides.springboot.todomanagement.service;

import java.util.List;

import net.guides.springboot.todomanagement.model.Policy;
import net.guides.springboot.todomanagement.model.UserPolicyMapping;

public interface PolicyService {
	List<Policy> getAllPolicies();
	void savePolicy(UserPolicyMapping userPolicyMapping);
	/* boolean buyPolicy(int policyId, int userId); */
	List<Policy> myPolicies(int userId);
	Policy getPolicyDetails(int policyId);
}
