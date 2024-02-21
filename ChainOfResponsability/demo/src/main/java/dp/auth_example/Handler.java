package dp.auth_example;

abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(UserRequest request);
}

class UserRequest {
    public String username;
    public String password;
    public String operation;
    public String resource;

    public UserRequest(String username, String password, String operation, String resource) {
        this.username = username;
        this.password = password;
        this.operation = operation;
        this.resource = resource;
    }
}

