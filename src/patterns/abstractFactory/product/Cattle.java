package patterns.abstractFactory.product;

public class Cattle implements Animal{

    @Override
    public void show() {
        System.out.println("动物：牛");
    }
}
