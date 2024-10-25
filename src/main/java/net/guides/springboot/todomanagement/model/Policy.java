package net.guides.springboot.todomanagement.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author priya
 *
 */
@Entity
@Table(name = "policies")
public class Policy implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyId;
	private String policyName;
	private String policyType;
	private String entryAge;
	private String maxMaturityAge;
	private String policyTerm;
	private String minSumAssured;
	private String policyPremium;
	private String policyStatus;
	private String policyNominee;
	private String policyPaymentMode;
	private String policyPremiumDueDate;
	
	public Policy() {
		super();
	}

	public Policy(int policyId, String policyName, String policyType, String entryAge, String maxMaturityAge,
			String policyTerm, String minSumAssured) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyType = policyType;
		this.entryAge = entryAge;
		this.maxMaturityAge = maxMaturityAge;
		this.policyTerm = policyTerm;
		this.minSumAssured = minSumAssured;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getEntryAge() {
		return entryAge;
	}

	public void setEntryAge(String entryAge) {
		this.entryAge = entryAge;
	}

	public String getMaxMaturityAge() {
		return maxMaturityAge;
	}

	public void setMaxMaturityAge(String maxMaturityAge) {
		this.maxMaturityAge = maxMaturityAge;
	}

	public String getPolicyTerm() {
		return policyTerm;
	}

	public void setPolicyTerm(String policyTerm) {
		this.policyTerm = policyTerm;
	}

	public String getMinSumAssured() {
		return minSumAssured;
	}

	public void setMinSumAssured(String minSumAssured) {
		this.minSumAssured = minSumAssured;
	}

	
	public String getPolicyPremium() {
		return policyPremium;
	}

	public void setPolicyPremium(String policyPremium) {
		this.policyPremium = policyPremium;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getPolicyNominee() {
		return policyNominee;
	}

	public void setPolicyNominee(String policyNominee) {
		this.policyNominee = policyNominee;
	}

	public String getPolicyPaymentMode() {
		return policyPaymentMode;
	}

	public void setPolicyPaymentMode(String policyPaymentMode) {
		this.policyPaymentMode = policyPaymentMode;
	}

	public String getPolicyPremiumDueDate() {
		return policyPremiumDueDate;
	}

	public void setPolicyPremiumDueDate(String policyPremiumDueDate) {
		this.policyPremiumDueDate = policyPremiumDueDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entryAge == null) ? 0 : entryAge.hashCode());
		result = prime * result + ((maxMaturityAge == null) ? 0 : maxMaturityAge.hashCode());
		result = prime * result + ((minSumAssured == null) ? 0 : minSumAssured.hashCode());
		result = prime * result + policyId;
		result = prime * result + ((policyName == null) ? 0 : policyName.hashCode());
		result = prime * result + ((policyTerm == null) ? 0 : policyTerm.hashCode());
		result = prime * result + ((policyType == null) ? 0 : policyType.hashCode());
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
		Policy other = (Policy) obj;
		if (entryAge == null) {
			if (other.entryAge != null)
				return false;
		} else if (!entryAge.equals(other.entryAge))
			return false;
		if (maxMaturityAge == null) {
			if (other.maxMaturityAge != null)
				return false;
		} else if (!maxMaturityAge.equals(other.maxMaturityAge))
			return false;
		if (minSumAssured == null) {
			if (other.minSumAssured != null)
				return false;
		} else if (!minSumAssured.equals(other.minSumAssured))
			return false;
		if (policyId != other.policyId)
			return false;
		if (policyName == null) {
			if (other.policyName != null)
				return false;
		} else if (!policyName.equals(other.policyName))
			return false;
		if (policyTerm == null) {
			if (other.policyTerm != null)
				return false;
		} else if (!policyTerm.equals(other.policyTerm))
			return false;
		if (policyType == null) {
			if (other.policyType != null)
				return false;
		} else if (!policyType.equals(other.policyType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", entryAge=" + entryAge + ", maxMaturityAge=" + maxMaturityAge + ", policyTerm=" + policyTerm
				+ ", minSumAssured=" + minSumAssured + "]";
	}

}
