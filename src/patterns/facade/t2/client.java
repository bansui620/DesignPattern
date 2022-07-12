package patterns.facade.t2;

public class client {
    public static void main(String[] args) {
        TVController controller = new TVController();
        controller.powerOn();
        controller.turnUp();
        controller.nextChannel();
    }
}
