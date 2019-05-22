package lesson3.factoryMethod;

public class ManagerCreator extends Creator {
    @Override
    public Role factoryMethod() {
        return new Manager();
    }
}
