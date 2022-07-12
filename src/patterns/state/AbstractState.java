package patterns.state;

public abstract class AbstractState {
    protected ScoreContext hj; //环境
    protected String stateName; //状态名
    protected int score; //分数

    public abstract void checkState(); //检查当前状态

    public void addScore(int x){
        score+=x;
        System.out.print("加上："+x+"分，当前分数："+score+"分");
        checkState();
        System.out.println(",当前状态为："+hj.getState().stateName);

    }
}
