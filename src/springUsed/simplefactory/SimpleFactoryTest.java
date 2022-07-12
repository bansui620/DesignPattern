package springUsed.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CourseFactory factory = new CourseFactory();
        ICourse java = factory.create("java");
        java.record();

        System.out.println("=======利用反射添加AI课程=======");

        ICourse ai = factory.create1(AICourse.class);
        ai.record();
    }
}
