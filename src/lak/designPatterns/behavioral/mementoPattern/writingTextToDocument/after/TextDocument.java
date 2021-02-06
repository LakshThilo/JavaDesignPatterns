package lak.designPatterns.behavioral.mementoPattern.writingTextToDocument.after;

public class TextDocument {

    private String text ="";
    private Memento memento = new Memento(text);

    public void write(String text){
        this.text += text;
    }

    public void print(){
        System.out.println(text);
    }

    public void save(){

        //This means when I (indistinct) save the memento state will be set to the text at that time.
        memento.setState(text);
    }

    public  void undo(){
        //So this is setting the text to the state that it was in when it was last saved
        text = memento.getState();
    }
}
