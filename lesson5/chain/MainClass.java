package lesson5.chain;

import lesson5.chain.server.Server;

public class MainClass {
    public static void main(String[] args) {
        Server server = new Server();
        server.registration("admin", "1234abracadabra");
        server.registration("GoTSucks", "/34LKJjkjdf4");

        Auth auth = new RequestAuth(3);
        auth.link(new RoleAuth()).link(new UserCheckAuth(server));

        server.setAuth(auth);
    }


}
