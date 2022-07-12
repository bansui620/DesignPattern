package patterns.factoryMethod.factory;

import patterns.factoryMethod.product.*;

public class TailgEBikeFactory implements eBikeFactory{

    @Override
    public EBike product() {
        return  new TailgEBike();
    }
}