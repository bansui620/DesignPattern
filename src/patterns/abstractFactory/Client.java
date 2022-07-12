package patterns.abstractFactory;

import patterns.abstractFactory.factory.*;
import patterns.abstractFactory.product.*;

public class Client {

    public static void main(String[] args) {
        //通过对象生成器类ReadXML读取XML配置文件中的数据来决定养什么动物和培养什么植物
        //可以不用修改客户端代码
/*        Farm f = (Farm) ReadXML.getObject();
        Animal a = f.newAnimal();
        Plant p = f.newPlant();
        a.show();
        p.show();*/

        System.out.println("韶关农场：");
        SGFarm sgFarm = new SGFarm();
        sgFarm.newAnimal().show();
        sgFarm.newPlant().show();
        System.out.println("-----------------------");
        System.out.println("上饶农场：");
        SRFarm srFarm = new SRFarm();
        srFarm.newAnimal().show();
        srFarm.newPlant().show();


    }
}
