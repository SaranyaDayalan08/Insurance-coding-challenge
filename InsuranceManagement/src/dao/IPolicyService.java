package dao;

public interface IPolicyService {
    boolean createPolicy(Policy policy) throws Exception;
    Policy getPolicy(int policyId) throws Exception;
    List<Policy> getAllPolicies() throws Exception;
    boolean updatePolicy(Policy policy) throws Exception;
    boolean deletePolicy(int policyId) throws Exception;
}