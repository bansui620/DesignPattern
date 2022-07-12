package patterns.adapter;

public abstract class CarController {
    public void move(){
        System.out.println("警车移动！");
    }
    public abstract void phonate();
    public abstract void twinkle();
}
