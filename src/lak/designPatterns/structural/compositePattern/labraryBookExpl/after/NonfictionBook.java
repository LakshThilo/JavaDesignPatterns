package lak.designPatterns.structural.compositePattern.labraryBookExpl.after;

public class NonfictionBook implements Books {

    String name;
    boolean checkOut;


    public NonfictionBook(String name){
        this.name = name;
        checkOut = false;
    }

    @Override
    public void checkout(){
        if(!checkOut){
            System.out.println("Checking out "+name +"\n");
            checkOut = true;
        } else {
            System.out.println(name +" is already checked out\n");
        }

    }

    @Override
    public void returnBook(){
        if(checkOut){
            System.out.println("Returning "+name+"\n");
            checkOut = false;
        } else{
            System.out.println(name+" is not checked out\n");
        }
    }
}
