package patterns.abstractFactory.product;

public class Fruitage implements Plant{

    @Override
    public void show() {
        System.out.println("植物：水果");
    }
}
