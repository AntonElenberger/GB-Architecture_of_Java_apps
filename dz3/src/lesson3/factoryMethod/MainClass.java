package lesson3.factoryMethod;

public class MainClass {
    public static void main(String[] args) {
        Creator[] creators = {new ManagerCreator(), new EngineerCreator()};

        for(Creator c : creators) {
            Role role = c.factoryMethod();
            System.out.println(role.getName());
        }
    }
}
