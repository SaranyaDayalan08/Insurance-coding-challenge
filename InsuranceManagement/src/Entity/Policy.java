package Entity;



	    public class Policy {
	        private int policyId;
	        private String policyName;
	        private double coverageAmount;
	        private String policyType;

	        public Policy() {
	            // Default constructor
	        }

	        public Policy(int policyId, String policyName, double coverageAmount, String policyType) {
	            this.policyId = policyId;
	            this.policyName = policyName;
	            this.coverageAmount = coverageAmount;
	            this.policyType = policyType;
	        }

	        // Getters and setters for all attributes

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

	        public double getCoverageAmount() {
	            return coverageAmount;
	        }

	        public void setCoverageAmount(double coverageAmount) {
	            this.coverageAmount = coverageAmount;
	        }

	        public String getPolicyType() {
	            return policyType;
	        }

	        public void setPolicyType(String policyType) {
	            this.policyType = policyType;
	        }

	        @Override
	        public String toString() {
	            return "Policy{" +
	                    "policyId=" + policyId +
	                    ", policyName='" + policyName + '\'' +
	                    ", coverageAmount=" + coverageAmount +
	                    ", policyType='" + policyType + '\'' +
	                    '}';
	        }
	    }

	
	
