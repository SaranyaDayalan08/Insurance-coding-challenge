package dao;

	public class InsuranceServiceImpl implements IPolicyService {

			package dao;

			import entity.Policy;
			import exception.PolicyNotFoundException;
			import util.DBConnection;

			import java.sql.Connection;
			import java.sql.PreparedStatement;
			import java.sql.ResultSet;
			import java.sql.SQLException;
			import java.util.ArrayList;
			import java.util.List;

			
			    @Override
			    public boolean createPolicy(Policy policy) {
			        Connection connection = null;
			        PreparedStatement statement = null;
			        try {
			            connection = DBConnection.getConnection();
			            String sql = "INSERT INTO policies (policy_details, client_id) VALUES (?, ?)";
			            statement = connection.prepareStatement(sql);
			            statement.setString(1, policy.getPolicyDetails());
			            statement.setInt(2, policy.getClientId());
			            return statement.executeUpdate() > 0;
			        } catch (SQLException e) {
			            e.printStackTrace();
			            return false;
			        } finally {
			            DBConnection.closeConnection(connection, statement);
			        }
			    }

			    @Override
			    public Policy getPolicy(int policyId) throws PolicyNotFoundException {
			        Connection connection = null;
			        PreparedStatement statement = null;
			        ResultSet resultSet = null;
			        try {
			            connection = DBConnection.getConnection();
			            String sql = "SELECT * FROM policies WHERE policy_id = ?";
			            statement = connection.prepareStatement(sql);
			            statement.setInt(1, policyId);
			            resultSet = statement.executeQuery();
			            if (resultSet.next()) {
			                return new Policy(
			                        resultSet.getInt("policy_id"),
			                        resultSet.getString("policy_details"),
			                        resultSet.getInt("client_id")
			                );
			            } else {
			                throw new PolicyNotFoundException("Policy with ID " + policyId + " not found");
			            }
			        } catch (SQLException e) {
			            e.printStackTrace();
			            throw new RuntimeException("Error retrieving policy", e); // Wrap SQLException for better handling
			        } finally {
			            DBConnection.closeConnection(connection, statement, resultSet);
			        }
			    }

			    @Override
			    public List<Policy> getAllPolicies() {
			        Connection connection = null;
			        PreparedStatement statement = null;
			        ResultSet resultSet = null;
			        List<Policy> policies = new ArrayList<>();
			        try {
			            connection = DBConnection.getConnection();
			            String sql = "SELECT * FROM policies";
			            statement = connection.prepareStatement(sql);
			            resultSet = statement.executeQuery();
			            while (resultSet.next()) {
			                policies.add(new Policy(
			                        resultSet.getInt("policy_id"),
			                        resultSet.getString("policy_details"),
			                        resultSet.getInt("client_id")
			                ));
			            }
			            return policies;
			        } catch (SQLException e) {
			            e.printStackTrace();
			            return policies; // Return an empty list on error
			        } finally {
			            DBConnection.closeConnection(connection, statement, resultSet);
			        }
			    }

			    @Override
			    public boolean updatePolicy(Policy policy) {
			        Connection connection = null;
			        PreparedStatement statement = null;
			        try {
			            connection = DBConnection.getConnection();
			            String sql = "UPDATE policies SET policy_details = ? WHERE policy_id = ?";
			            statement = connection.prepareStatement(sql);
			            statement.setString(1, policy.getPolicyDetails());
			            statement.setInt(2, policy.getPolicyId());
			            return statement.executeUpdate() > 0;
			        } catch (SQLException e) {
			            e.printStackTrace();
			            return false;
			        } finally {
			            DBConnection.closeConnection(connection, statement);
			        }
			    }

			    @Override
			    public boolean deletePolicy(int policyId) throws PolicyNotFoundException {
			        Connection connection = null;
			        PreparedStatement statement = null;
			        try {
			            connection = DBConnection.getConnection();
			            String sql = "DELETE FROM policies WHERE policy_id = ?";
			            statement = connection.prepareStatement(sql);
			            statement.setInt(1, policyId);
			            int rowsAffected = statement.executeUpdate();
			            if (rowsAffected > 0) {
			                return true;
			            } else {
			                throw new PolicyNotFoundException("Policy with ID " + policyId + " not found");
			            }
			        } catch (SQLException e) {
			            e.printStackTrace();
			            return false;
			        } finally {
			            DBConnection.closeConnection(connection, statement);
			        }
			    }
			  
			  
