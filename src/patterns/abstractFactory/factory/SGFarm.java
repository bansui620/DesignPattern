package patterns.abstractFactory.factory;

import patterns.abstractFactory.product.*;

public class SGFarm implements Farm{

    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生了！");

        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
