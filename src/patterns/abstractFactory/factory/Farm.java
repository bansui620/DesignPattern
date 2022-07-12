package patterns.abstractFactory.factory;

import patterns.abstractFactory.product.*;

public interface Farm {
    Animal newAnimal();

    Plant newPlant();
}
