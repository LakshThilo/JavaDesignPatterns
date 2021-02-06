package lak.designPatterns.structural.flyweightPattern;

public class Flyweight_Pattern {
        /*
         A proxy is used as a source of replacement for a real object. It literally means a substitute for the real thing.
         In real life, a good example of a proxy is a bank card. Instead of paying with the real money in your accounts,
         your bank card acts as a proxy and allows you to access. the actual money when you need it.

         In computing, you might've have come across the concept of proxy servers, which is service that sit between the
         clients and the actual server and pass messages between the two. This is a similar concept to the proxy pattern
         in Java. There are a few different types of proxy patterns. The one I'm going to be concentrating on in this chapter
         is virtual proxies. Virtual proxies are used to save memory and improve startup times and applications.

         Say, for example, you have an app for displaying documents. There might be a big picture on page 50, say of the
         document. And when you open the document, you don't really want to load the big picture right away as that might
         take a long time and use lots of memory. You don't even know if the person using the app is ever going to scroll
         down to page 50. Instead of creating the big image object straight away, you could create a proxy object for it.

         Proxy objects differentiate between expensive operations and inexpensive operations. The image objects might have
         inexpensive methods like getWidth() and getHeight() and you might want to access this information before we actually
         draw it. Other things like loadImageFromDisk are expensive and we don't want to call them until we really need to.

         This is where the proxy pattern comes in to help. It only calls the expensive method when needed, this is a technique
         known as lazy loading. So the proxy pattern is used when he wants to replace an actual objects with something more versatile.
         It's sometime used in graphical user interfaces where you want to put offloading expensive objects. Another common
         use is for database connections, where your app has an expensive call to a database. And you only want to do that when
         you need to actually interact with the database, rather than its start up time. Other types of proxy, such as
         protection proxies, are used to restrict access rights. There might be a few parts of an application that needs to
         be verified with authentication credentials.

         A proxy can be used for that authentication and only allow access to the real object if the client
         provides the correct details.
        */

}
