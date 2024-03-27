package util;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.util.Properties;

	public class DBConnection {
	    private static final String PROPERTY_FILE = "database.properties";
	    private static Connection connection;

	    private DBConnection() {}

	    public static Connection getConnection() throws SQLException {
	        if (connection == null) {
	            connection = createConnection();
	        }
	        return connection;
	    }

	    private static Connection createConnection() throws SQLException {
	        Properties props = new Properties();
	        try {
	            props.load(DBConnection.class.getClassLoader().getResourceAsStream(PROPERTY_FILE));
	        } catch (Exception e) {
	            throw new SQLException("Failed to load database properties from " + PROPERTY_FILE, e);
	        }
	        String url = props.getProperty("jdbc:mysql://localhost:3306/INSURANCE_MANAGEMENT");
	        String username = props.getProperty("root");
	        String password = props.getProperty("sara@123");
	        return DriverManager.getConnection(url, username, password);
	    }
	}