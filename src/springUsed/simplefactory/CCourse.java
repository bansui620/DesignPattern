package springUsed.simplefactory;

public class CCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录制C语言课程");
    }
}
