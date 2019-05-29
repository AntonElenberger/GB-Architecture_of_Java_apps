package lesson5.chain;

import lesson5.chain.server.Server;

public class UserCheckAuth extends Auth {
    private Server server;

    public UserCheckAuth(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String login, String password) {
        if(!server.hasLogin(login)) {
            System.out.println("User doesn't exists");
            return false;
        }

        if(!server.checkPassword(login, password)) {
            System.out.println("Password doesn't match");
            return false;
        }
        return checkNext(login, password);
    }
}
