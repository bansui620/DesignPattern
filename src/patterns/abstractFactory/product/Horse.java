package patterns.abstractFactory.product;

public class Horse implements Animal{

    @Override
    public void show() {
        System.out.println("动物：马");
    }
}
