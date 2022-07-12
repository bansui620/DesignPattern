package patterns.state;

public class HighState extends AbstractState{

    public HighState(AbstractState state){
        hj=state.hj;
        stateName="优秀";
        score=state.score;
    }
    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 60) {
            hj.setState(new MiddleState(this));
        }
    }
}
