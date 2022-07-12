package patterns.factoryMethod;

import patterns.factoryMethod.factory.*;
import patterns.factoryMethod.product.*;

public class Client {
    
    public static void main(String[] args) {
        AimaEBikeFactory aimaEBikeFactory = new AimaEBikeFactory();
        EBike eBike = aimaEBikeFactory.product();
        System.out.println(eBike.brand());

        System.out.println("--------------------");

        TailgEBikeFactory tailgEBikeFactory = new TailgEBikeFactory();
        EBike eBike2 = tailgEBikeFactory.product();
        System.out.println(eBike2.brand());

//        eBikeFactory eBikeFactory= (eBikeFactory) ReadXML.getObject();
//        EBike eBike = eBikeFactory.product();
//        System.out.println(eBike.brand());

    }
}
