package lak.designPatterns.structural.proxyPattern.imageSlideShow.after;

/*  Now we can make some changes, to this image gallery up, so that it consumes less memory, by implementing the proxy pattern.
    To do this, I'm going to create a proxy image object, which will only call the expensive load method when it's needed, and
    will only ever call at once.*/

public class ImageProxy implements DisplayObject{

    String path;
    ImageFile imageFile;

    public ImageProxy(String path){
        this.path = path;
    }

    /*The first thing I'm going to do in here, is to check if I've already created the image. So I'll say if... image file is equal
    to null. And if it is null, then I'll go ahead and assign my image file field to a new image file object, and pass in the path.
    If it's not null, then I don't need to do anything. I can now just call image file dot display. This means that if I call the
    display method a second time, it doesn't have to read the image from disk again. If I go back to my image gallery class,
    I'm calling the display method on each image twice. So this check means I'm loading images half as many times as I would otherwise be.
    Now I can use my image proxy everywhere that I was using image file before.*/
    @Override
    public void display() {
        if(imageFile == null){
            imageFile = new ImageFile(path);
        }
        imageFile.display();
    }
}
