package lak.designPatterns.structural.proxyPattern.imageSlideShow.after;

public class ImageGallery {

    /* At the moment, my app risen image file from disk every time a new image is created, but if I implemented the proxy pattern, I wouldn't have to do this.*/
    public static void main(String[] args) {


    /*Inside the main method I'm creating 10 new display image objects called image1, image2, image3 and so on. For each one,
    I'm assigning it to one of the images in my resources folder. In a more sophisticated photo gallery app, there might be a
    next person on the user interface to then display a new image. But to keep this example simple, I'm just moving on to the
    next image using code. So for each image object, I'm just going to call the display method. I also wanted to go back to
    the beginning and dig through them all again. So, I've copied and pasted the call to display each image again below. */

        DisplayObject image1 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image1.jpeg");
        DisplayObject image2 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image2.jpeg");
        DisplayObject image3 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image3.jpeg");
        DisplayObject image4 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image4.jpeg");
        DisplayObject image5 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image5.jpeg");
        DisplayObject image6 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image6.jpeg");
        DisplayObject image7 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image7.jpeg");
        DisplayObject image8 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image8.jpeg");
        DisplayObject image9 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image9.jpeg");
        DisplayObject image10 = new ImageProxy("G:\\Java-Spring\\Spring-Projects\\EmployeeManagementSystem\\JavaDesignPatterns\\src\\lak\\designPatterns\\structural\\proxyPattern\\resoures\\image10.jpeg");

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

        /* So I'll replace all of those. This means that if I never called the display method when I'm clicking through the slideshow,
        I'll never have to load that image, because unlike the image file class, it doesn't do that in the constructor. It only tries
        to load the image when the display method is called. So this is the technique known as lazy loading. So this is how the proxy
        method can help you to reduce memory use, when you're using expensive method calls.*/
    }
}
