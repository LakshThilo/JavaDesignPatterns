package lak.designPatterns.behavioral.commandPattern;

public class Command_Pattern {

/*
 * Sometimes when writing software, you need to issue a request, but you might not know anything about what's being requested or what's receiving the request.
 *
 * So let's think about a real world example.
    -  Imagine someone's written an app for buying and selling things online.So the app could be used by lots of different companies, selling different things.

    One example might be a restaurant using it to allow customers to order food online.
    Another company might use it for selling clothes online. In both cases, the user journey is pretty much the same.

    * The customer's browsing online and they decide they want to order something.
    * So they input their order into the app and that information gets passed from the app to the company,

    but when the app is being written, we can't say explicitly that the customer might want to order pizza or order a pair of shoes.
    What exactly they're ordering is down to the different companies using the app.
    We also don't know what will happen after the order is sent. So there might be an immediate response saying the order is on its way,
    or there might be some checks to see if the orders in stock, or there might be a reply saying that your order will arrive in a month.*/

  /**
    The command pattern is a way of making requests when you don't know anything about what's exactly is being requested or what exactly is receiving it.
    It does this by encapsulating the request inside an object.So the command pattern is especially useful for commands that you might want to perform later on.
    For example,
        - they are sometimes used to support, undo and redo operations and
        - things like queuing or logging requests to be performed at different times.

    Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request.
    This transformation lets you parameterize methods with different requests, delay or queue a request’s execution, and support undoable operations.
   */
}
