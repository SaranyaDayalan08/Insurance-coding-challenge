package Entity;

public class Client {
	
	    private int clientId;
	    private String clientName;
	    private String contactInfo;
	    private String policy;

	    // Default constructor
	    public Client() {
	    }

	    // Parameterized constructor
	    public Client(int clientId, String clientName, String contactInfo, String policy) {
	        this.clientId = clientId;
	        this.clientName = clientName;
	        this.contactInfo = contactInfo;
	        this.policy = policy;
	    }

	    // Getters and setters
	    public int getClientId() {
	        return clientId;
	    }

	    public void setClientId(int clientId) {
	        this.clientId = clientId;
	    }

	    public String getClientName() {
	        return clientName;
	    }

	    public void setClientName(String clientName) {
	        this.clientName = clientName;
	    }

	    public String getContactInfo() {
	        return contactInfo;
	    }

	    public void setContactInfo(String contactInfo) {
	        this.contactInfo = contactInfo;
	    }

	    public String getPolicy() {
	        return policy;
	    }

	    public void setPolicy(String policy) {
	        this.policy = policy;
	    }
	    
	    public void printDetails() {
	        System.out.println("Client Details:");
	        System.out.println("Client ID: " + clientId);
	        System.out.println("Client Name: " + clientName);
	        System.out.println("Contact Info: " + contactInfo);
	        System.out.println("Policy: " + policy);
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "Client{" +
	                "clientId=" + clientId +
	                ", clientName='" + clientName + '\'' +
	                ", contactInfo='" + contactInfo + '\'' +
	                ", policy='" + policy + '\'' +
	                '}';
	    }

}
