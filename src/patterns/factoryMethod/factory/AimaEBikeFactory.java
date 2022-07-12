package patterns.factoryMethod.factory;
import patterns.factoryMethod.product.*;

//爱玛牌电动车工厂
public class AimaEBikeFactory implements eBikeFactory {

    @Override
    public EBike product() {
        return  new AimaEBike();
    }
}
