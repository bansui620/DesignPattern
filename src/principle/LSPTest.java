package principle;

//里氏替换原则
public class LSPTest {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        IDog iDog = new MyDog();
        childClass.pm(iDog);
        childClass.cm();
    }
}

interface IDog{

}

class MyDog implements IDog{

}

class ParentClass{
    public void pm(MyDog myDog){
        System.out.println("我的dog");
    }
}

class ChildClass extends ParentClass{
    //按照里氏替换原则子类重载父类方法时，输入参数要更加宽松
    public void pm(IDog newDog) {
        super.pm((MyDog) newDog);
    }

    public void cm(){
        System.out.println("子类可以增加自己方法");
    }
}
