package lak.designPatterns.structural.compositePattern.labraryBookExpl.before;

public class FictionBook {

    String name;
    boolean checkOut;
    boolean isAPlay;

    public FictionBook(String name, boolean isAPlay){
        this.name = name;
        this.isAPlay = isAPlay;
        checkOut = false;
    }

    public void checkout(){
        if(!checkOut){
            System.out.println("Checking out "+name +"\n");
            checkOut = true;
        } else {
            System.out.println(name +" is already checked out\n");
        }

    }

    public void returnBook(){
        if(checkOut){
            System.out.println("Returning "+name+"\n");
            checkOut = false;
        } else{
            System.out.println(name+" is not checked out\n");
        }
    }
}
