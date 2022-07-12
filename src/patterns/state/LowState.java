package patterns.state;

public class LowState extends AbstractState{
    //初始化
    public LowState(ScoreContext h) {
        hj = h;
        stateName = "不及格";
        score = 0;
    }

    public LowState(AbstractState state) {
        hj = state.hj;
        stateName = "不及格";
        score = state.score;
    }

    @Override
    public void checkState() {
        if(score>=90){
            hj.setState(new HighState(this));
        }else if(score>=60){
            hj.setState(new MiddleState(this));
        }
    }
}
