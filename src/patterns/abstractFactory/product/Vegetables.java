package patterns.abstractFactory.product;

public class Vegetables implements Plant{

    @Override
    public void show() {
        System.out.println("植物：蔬菜");
    }
}
