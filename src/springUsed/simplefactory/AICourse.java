package springUsed.simplefactory;

public class AICourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录制AI课程");
    }
}
