package main;

	

	import dao.InsuranceServiceImpl;
	import entity.Policy;
	import exception.PolicyNotFoundException;

	public class MainModule {
	    public static void main(String[] args) {
	        // Instantiate service implementation class
	        InsuranceServiceImpl service = new InsuranceServiceImpl();

	        // Create a new policy
	        Policy newPolicy = new Policy();
	        newPolicy.setPolicyId(1); // Set policy ID
	        newPolicy.setPolicyName("Health Insurance");
	        newPolicy.setPolicyType("Medical");
	        newPolicy.setCoverageAmount(50000.0);
	        newPolicy.setStartDate("2024-01-01");
	        newPolicy.setEndDate("2024-12-31");
	        newPolicy.setPremiumAmount(1000.0);

	        // Create the policy
	        boolean policyCreated = service.createPolicy(newPolicy);
	        if (policyCreated) {
	            System.out.println("Policy created successfully!");
	        } else {
	            System.out.println("Failed to create policy.");
	        }

	        // Retrieve a policy
	        try {
	            Policy retrievedPolicy = service.getPolicy(1);
	            System.out.println("Retrieved Policy: " + retrievedPolicy);
	        } catch (PolicyNotFoundException e) {
	            System.out.println(e.getMessage());
	        }

	        // Update a policy
	        newPolicy.setPremiumAmount(1200.0);
	        boolean policyUpdated = service.updatePolicy(newPolicy);
	        if (policyUpdated) {
	            System.out.println("Policy updated successfully!");
	        } else {
	            System.out.println("Failed to update policy.");
	        }

	        // Delete a policy
	        try {
	            boolean policyDeleted = service.deletePolicy(1);
	            if (policyDeleted) {
	                System.out.println("Policy deleted successfully!");
	            } else {
	                System.out.println("Failed to delete policy.");
	            }
	        } catch (PolicyNotFoundException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
