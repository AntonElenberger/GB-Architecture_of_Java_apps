package lesson5.chain.server;

import lesson5.chain.Auth;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Auth auth;

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public boolean authUser(String login, String password) {
        if(auth.check(login, password)) {
            System.out.printf("Authentication success");
            return true;
        }
        return false;
    }

    public void registration(String login, String password) {
        users.put(login, password);
    }

    public boolean hasLogin(String login) {
        return users.containsKey(login);
    }

    public boolean checkPassword(String login, String password) {
        return users.get(login).equals(password);
    }
}
