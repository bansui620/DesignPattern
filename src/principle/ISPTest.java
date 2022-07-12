package principle;

//接口隔离原则
public class ISPTest {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.swim();
    }
}

interface IEatAnimal{
    void eat();
}

interface IFlyAnimal{
    void fly();
}

interface ISwimAnimal{
    void swim();
}

class Dog implements ISwimAnimal,IEatAnimal{

    @Override
    public void eat() {
        System.out.println("狗可以吃饭");
    }

    @Override
    public void swim() {
        System.out.println("狗可以游泳");
    }
}