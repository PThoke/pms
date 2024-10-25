package net.guides.springboot.todomanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user_policy_mapping")
public class UserPolicyMapping {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userPolicyMappingId;
	private int userId;
	private int policyId;
	
	public UserPolicyMapping() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserPolicyMapping(int userId, int policyId) {
		super();
		this.userId = userId;
		this.policyId = policyId;
	}
	public int getUserPolicyMappingId() {
		return userPolicyMappingId;
	}
	public void setUserPolicyMappingId(int userPolicyMappingId) {
		this.userPolicyMappingId = userPolicyMappingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + policyId;
		result = prime * result + userId;
		result = prime * result + userPolicyMappingId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPolicyMapping other = (UserPolicyMapping) obj;
		if (policyId != other.policyId)
			return false;
		if (userId != other.userId)
			return false;
		if (userPolicyMappingId != other.userPolicyMappingId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserPolicyMapping [userPolicyMappingId=" + userPolicyMappingId + ", userId=" + userId + ", policyId="
				+ policyId + "]";
	}
}
