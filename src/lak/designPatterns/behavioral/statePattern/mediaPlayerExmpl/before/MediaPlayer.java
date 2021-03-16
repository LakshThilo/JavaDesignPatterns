package lak.designPatterns.behavioral.statePattern.mediaPlayerExmpl.before;

public class MediaPlayer {

    private String state = "paused";
    private String icon = "play button"; // In a real application, the icon would be an actual image but to keep this example simple I'm just using a string to describe where the icon would be.

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    /*the play method I have a switch statement. If the state is paused, then I set it to playing and I set the
    icon to a pause button. Then I print out a message to the console saying that the video is playing and the icon
    is set to paused. If it's set to playing already then I don't need to do anything. So I just have a break in that case.*/
    public void play() {
        switch (state){
            case "paused":
                setState("playing");
                setIcon("pause button");
                System.out.println("Video playing, icon set to "+ getIcon());
                break;
            case "playing":
                break;
        }
    }

    /*is the pause method. This is very similar to the play method above and has a similar switch statements. But if the state is paused,
    then I do nothing. If it's playing, then I set to paused and set the icon to a play button. This is quite a messy solution.*/
    public void pause() {
        switch (state){
            case "paused":
                break;
            case "playing":
                setState("paused");
                setIcon("play button");
                System.out.println("Video pause, icon set to "+getIcon());
                break;
        }
    }

}
