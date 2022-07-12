package patterns.singleton;

public class Visitor {
    private static final Visitor VISITOR = new Visitor();
    private static int num = 0;

    public Visitor() {
    }

    public static Visitor getVisitor(){
        num++;
        System.out.println("欢迎用户光临本站！");
        return VISITOR;
    }

    public int getNumber(){
        return Visitor.num;
    }
}
