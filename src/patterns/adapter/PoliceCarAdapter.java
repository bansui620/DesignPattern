package patterns.adapter;

public class PoliceCarAdapter extends CarController{
    PoliceSound ps;
    PoliceLamp pl;

    public PoliceCarAdapter() {

       ps = new PoliceSound();
       pl = new PoliceLamp();

    }

    @Override
    public void phonate() {
        pl.alarmLamp();
    }

    @Override
    public void twinkle() {
        ps.alarmSound();
    }
}
