package patterns.abstractFactory.factory;

import patterns.abstractFactory.product.*;

public class SRFarm implements Farm{

    @Override
    public Animal newAnimal() {
        System.out.println("新马出生了！");

        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}
