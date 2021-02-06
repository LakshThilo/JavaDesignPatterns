package lak.designPatterns.behavioral.statePattern.tempController.after;

public class Fan {

    private FanState state = new HighState();

    public FanState getState() {
        return state;
    }

    public void setState(FanState state) {
        this.state = state;
    }

    public void turnUp(){
        state.turnUp(this);

    }

    public void turnDown(){
      state.turnDown(this);
    }
}
