package dp.auth_example;

public class Example {
    public static void main(String[] args) {
        Handler authenticationHandler = new AuthenticationHandler();
        Handler permissionHandler = new PermissionHandler();
        Handler rbacHandler = new RoleBasedAccessControlHandler();

        authenticationHandler.setSuccessor(permissionHandler);
        permissionHandler.setSuccessor(rbacHandler);

        UserRequest request = new UserRequest("user", "pass", "read", "someResource");
        authenticationHandler.handleRequest(request);

        UserRequest writeRequest = new UserRequest("user", "pass", "write", "resource1");
        authenticationHandler.handleRequest(writeRequest);
    }
}
