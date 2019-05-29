package lesson5.chain;

public class RoleAuth extends Auth {
    @Override
    public boolean check(String login, String password) {
        if(login.equals("admin")) {
            System.out.println("Have a nice work!");
            return true;
        } else {
            System.out.println("Welcome " + login + "!");
        }

       return checkNext(login, password);
    }
}
