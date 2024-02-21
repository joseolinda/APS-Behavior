package dp.auth_example;

class AuthenticationHandler extends Handler {
    @Override
    public void handleRequest(UserRequest request) {
        // Simulando autenticação bem-sucedida
        if ("user".equals(request.username) && "pass".equals(request.password)) {
            System.out.println("Authentication successful");
            if (successor != null) {
                successor.handleRequest(request);
            }
        } else {
            System.out.println("Authentication failed");
        }
    }
}

class PermissionHandler extends Handler {
    @Override
    public void handleRequest(UserRequest request) {
        // Simulando verificação de permissão
        if ("read".equals(request.operation)) {
            System.out.println("Permission granted for reading");
            if (successor != null) {
                successor.handleRequest(request);
            }
        } else {
            System.out.println("Permission denied");
        }
    }
}

class RoleBasedAccessControlHandler extends Handler {
    @Override
    public void handleRequest(UserRequest request) {
        // Simulando controle de acesso baseado em papel
        System.out.println("Role-based access control passed for " + request.resource);
        // Aqui, poderíamos verificar o papel do usuário antes de permitir a operação
    }
}

