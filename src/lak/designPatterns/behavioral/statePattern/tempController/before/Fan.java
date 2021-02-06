package lak.designPatterns.behavioral.statePattern.tempController.before;

public class Fan {

    private String state = "low";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void turnUp(){
        switch (state){
            case "low":
                setState("medium");
                System.out.println("Fan is on medium");
                break;
            case "medium":
                setState("high");
                System.out.println("Fan is on high");
                break;
            case "high":
                break;
        }

    }

    public void turnDown(){
        switch (state){
            case "high":
                setState("medium");
                System.out.println("Fan is on medium");
                break;
            case "medium":
                setState("low");
                System.out.println("Fan is on low");
                break;
            case "low":
                break;
        }
    }
}
