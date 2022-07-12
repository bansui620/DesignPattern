package springUsed.lazySingleton;

public class LazyDoubleCheck {
    private LazyDoubleCheck(){}

    private volatile static LazyDoubleCheck lazy = null;
    public  static LazyDoubleCheck getInstance(){
        if (lazy==null){
            synchronized(LazyDoubleCheck.class){
                if (lazy==null){
                    lazy = new LazyDoubleCheck();
                }
            }
        }
        return lazy;
    }
}
