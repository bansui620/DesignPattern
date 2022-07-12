package patterns.factoryMethod.factory;

import patterns.factoryMethod.product.*;

public class YadeaEBikeFactory implements eBikeFactory{

    @Override
    public EBike product() {
        return  new YadeaEBike();
    }
}