package util;



	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertyUtil {
	    private static final String PROPERTY_FILE = "db.properties";

	    // Static method to read property file and get connection string
	    public static String getPropertyString() {
	        Properties properties = new Properties();
	        String connectionString = null;
	        try (FileInputStream fis = new FileInputStream(PROPERTY_FILE)) {
	            properties.load(fis);
	            // Construct connection string from properties
	            String hostname = properties.getProperty("hostname");
	            String dbname = properties.getProperty("dbname");
	            String username = properties.getProperty("username");
	            String password = properties.getProperty("password");
	            String port = properties.getProperty("port");

	            connectionString = "jdbc:mysql://" + hostname + ":" + port + "/" + dbname + "?user=" + username + "&password=" + password;
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return connectionString;
	    }
	}


