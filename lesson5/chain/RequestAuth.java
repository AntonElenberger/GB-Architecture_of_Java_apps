package lesson5.chain;

public class RequestAuth extends Auth {
    private final int requestLimit = 5;
    private int request;

    public RequestAuth(int request) {
        this.request = request;
    }

    @Override
    public boolean check(String login, String password) {
        if(request > requestLimit) {
            System.out.println("Auth limit");
        } else {
            request++;
        }
        return checkNext(login, password);
    }
}
