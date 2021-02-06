package lak.designPatterns.structural.proxyPattern.imageSlideShow.before;

public class ImageGallery {

    /* At the moment, my app risen image file from disk every time a new image is created, but if I implemented the proxy pattern, I wouldn't have to do this.*/
    public static void main(String[] args) {


    /*Inside the main method I'm creating 10 new display image objects called image1, image2, image3 and so on. For each one,
    I'm assigning it to one of the images in my resources folder. In a more sophisticated photo gallery app, there might be a
    next person on the user interface to then display a new image. But to keep this example simple, I'm just moving on to the
    next image using code. So for each image object, I'm just going to call the display method. I also wanted to go back to
    the beginning and dig through them all again. So, I've copied and pasted the call to display each image again below. */

        DisplayObject image1 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image1.jpeg");
        DisplayObject image2 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image2.jpeg");
        DisplayObject image3 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image3.jpeg");
        DisplayObject image4 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image4.jpeg");
        DisplayObject image5 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image5.jpeg");
        DisplayObject image6 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image6.jpeg");
        DisplayObject image7 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image7.jpeg");
        DisplayObject image8 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image8.jpeg");
        DisplayObject image9 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image9.jpeg");
        DisplayObject image10 = new ImageFile("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image10.jpeg");

        image1.display();
        image2.display();
        image3.display();
        image4.display();
        image5.display();
        image6.display();
        image7.display();
        image8.display();
        image9.display();
        image10.display();

        image1.display();
        image2.display();
        image3.display();
        image4.display();
        image5.display();
        image6.display();
        image7.display();
        image8.display();
        image9.display();
        image10.display();

        /* one of the drawbacks of this is that I'm loading all of the images from disk at the beginning of the main method.
        But I don't know if the user is even going to click through all 10 pictures, which would mean they're loaded for nothing.
        With only 10 photos, the cost of this isn't too bad, but what if they were 100 or a thousand images? This is where the
        proxy pattern can come in to resolve those issues.*/
    }
}
