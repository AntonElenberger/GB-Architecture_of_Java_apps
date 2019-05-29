package lesson5.chain;

public abstract class Auth {
    private Auth next;

    public Auth link(Auth next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String login, String password);

    public boolean checkNext(String login, String password) {
        if(next == null) {
            return true;
        } else {
            return next.check(login, password);
        }
    }
}
