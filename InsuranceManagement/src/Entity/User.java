package Entity;

public class User {

	    private int userId;
	    private String username;
	    private String password;
	    private String role;

	    // Default constructor
	    public User() {
	    }

	    // Parameterized constructor
	    public User(int userId, String username, String password, String role) {
	        this.userId = userId;
	        this.username = username;
	        this.password = password;
	        this.role = role;
	    }

	    // Getters and setters
	    public int getUserId() {
	        return userId;
	    }

	    public void setUserId(int userId) {
	        this.userId = userId;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getRole() {
	        return role;
	    }

	    public void setRole(String role) {
	        this.role = role;
	    }
	    
	    public void printDetails() {
	        System.out.println("User Details:");
	        System.out.println("User ID: " + userId);
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);
	        System.out.println("Role: " + role);
	    }
	    // toString method
	    @Override
	    public String toString() {
	        return "User{" +
	                "userId=" + userId +
	                ", username='" + username + '\'' +
	                ", password='" + password + '\'' +
	                ", role='" + role + '\'' +
	                '}';
	    }
}

