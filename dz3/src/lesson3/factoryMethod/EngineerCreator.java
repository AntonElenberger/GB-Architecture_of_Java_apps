package lesson3.factoryMethod;

public class EngineerCreator extends Creator {
    @Override
    public Role factoryMethod() {
        return new Engineer();
    }
}
