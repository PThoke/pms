package net.guides.springboot.todomanagement.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import net.guides.springboot.todomanagement.model.Policy;
import net.guides.springboot.todomanagement.model.UserPolicyMapping;
import net.guides.springboot.todomanagement.repository.PolicyRepository;
import net.guides.springboot.todomanagement.repository.PolicyUserRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyRepository policyRepository;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	private PolicyUserRepository policyUserRepository;
	
	
	@Override
	public List<Policy> getAllPolicies() {
		return policyRepository.findAll();
	}
	
	/*@Override
	public boolean buyPolicy(int policyId, int userId) {
		int mappingId = policyRepository.savePolicy(policyId, userId);
		return mappingId > 0;
	}*/
	
	@Override
	public void savePolicy(UserPolicyMapping userPolicyMapping) {
		policyUserRepository.save(userPolicyMapping);
	}

	@Override
	public List<Policy> myPolicies(int userId) {
		//System.out.println("NAMED JDBC TEMPLATE : "+namedParameterJdbcTemplate);
		String sql = " SELECT * FROM policies p "+
					 " INNER JOIN user_policy_mapping upm ON upm.policy_id = p.policy_id  "+
					 " WHERE upm.user_id = :userId ";
		HashMap<String, Object> queryParam = new HashMap<>();
		queryParam.put("userId", userId);
		List<Policy> myPolicy = namedParameterJdbcTemplate.query(sql, queryParam, BeanPropertyRowMapper.newInstance(Policy.class));
		return myPolicy;
	}

	@Override
	public Policy getPolicyDetails(int policyId) {
		// TODO Auto-generated method stub
		String sql = " SELECT * FROM policies p "
				//+ " INNER JOIN user_policy_mapping upm ON upm.policy_id = p.policy_id  "
				+ " WHERE p.policy_id = :policyId ";
		HashMap<String, Object> queryParam = new HashMap<>();
		queryParam.put("policyId", policyId);
		Policy myPolicy = namedParameterJdbcTemplate.queryForObject(sql, queryParam,
				BeanPropertyRowMapper.newInstance(Policy.class));
		return myPolicy;
	}
	
}
