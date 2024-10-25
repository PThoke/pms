package net.guides.springboot.todomanagement.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot.todomanagement.model.Policy;
import net.guides.springboot.todomanagement.model.PolicyUserDetails;
import net.guides.springboot.todomanagement.model.UserPolicyMapping;
import net.guides.springboot.todomanagement.service.PolicyService;

@Controller
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@RequestMapping(value = "/list-policies", method = RequestMethod.GET)
	public String getAllPolicies(ModelMap model) {
		model.addAttribute("policies", policyService.getAllPolicies());
		model.addAttribute("page", "all-policy");
		PolicyUserDetails userDetails = (PolicyUserDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		model.addAttribute("loggedInUser", userDetails);
		model.addAttribute("currentPage", "list-policies");
		return "list-policies";
	}

	@RequestMapping(value = "/buy-policy", method = RequestMethod.GET)
	public String savePolicy(ModelMap model, @RequestParam int policyId) {
		PolicyUserDetails userDetails = (PolicyUserDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		int userId = userDetails.getUserId();
		UserPolicyMapping userPolicyMapping = new UserPolicyMapping(userId, policyId);
		policyService.savePolicy(userPolicyMapping);
		model.addAttribute("currentPage", "my-policies");
		return "redirect:/my-policies";
	}

	@RequestMapping(value = "/my-policies", method = RequestMethod.GET)
	public String getMyPolicies(ModelMap model) {
		PolicyUserDetails userDetails = (PolicyUserDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		int userId = userDetails.getUserId();
		model.addAttribute("myPolycies", policyService.myPolicies(userId));
		model.addAttribute("page", "my-policy");
		model.addAttribute("loggedInUser", userDetails);
		model.addAttribute("currentPage", "my-policies");
		return "my-policies";
	}

	
	@RequestMapping(value = "/show-policy-details/{policyId}", method = RequestMethod.GET)
	public String showPolicyDetails(ModelMap model, @PathVariable("policyId") int policyId) {
		PolicyUserDetails userDetails = (PolicyUserDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		int userId = userDetails.getUserId();
		Policy policy = policyService.getPolicyDetails(policyId);
		model.addAttribute("loggedInUser", userDetails);
		HashMap<String, Object> policyDetails = new HashMap<>();
		policyDetails.put("assuredName", userDetails.getFirstName() + " "+userDetails.getLastName());
		policyDetails.put("installmentPremium", policy.getPolicyPremium());
		policyDetails.put("installmentDueDate", policy.getPolicyPremiumDueDate());
		policyDetails.put("policyStatus", policy.getPolicyStatus());
		policyDetails.put("policyMode", policy.getPolicyPaymentMode());
		policyDetails.put("policySumAssured", policy.getMinSumAssured());
		policyDetails.put("nominee", policy.getPolicyNominee());
		model.addAttribute("policyDetails", policyDetails);
		return "policy-details";
	}
	 
	
	
	
}
