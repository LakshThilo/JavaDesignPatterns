package lak.designPatterns.behavioral.interpreterPattern;

public class Interpreter_Pattern {

    /*
    * Imagine a scenario, where two people are trying to communicate but they don't speak the same language.
    * A translator or an interpreter can join them and translates everything they say to each other. */

   /** The interpreter pattern is a way of translating one language into another. So if you think of Google translate for example,
    * it takes the input language and interprets it into a new language.*/

    /*  It could be used to
        - write custom regular expressions or
        - writes your own compiler or
        - translate human languages or parsers SQL, or
        - just create a simple calculator.

    * The idea of the interpreter pattern in Java is that if the same problem keeps coming up, then you can express
      that problem as a sentence and interpret it. The interpreter defines a grammar for the language and then used as
      an abstract syntax tree to interpret it

    *   - The first components in the interpreter pattern is the context. If you were translating a sentence into another language,
           the context would be the sentence. So the context is often just a string.
        - The next part is an abstract expression class. This is an interface or an abstract class
          that defines a method used for interpreting the context. Each time there's interpret method is called,
          the context has changed in some way.

          There are two different possible implementations of the abstract expression,
            1. terminal and
            2. non-terminal.
          A non-terminal expression cause the interpret method, which alters the context, and then it passes the context
          onto another expression until it reaches the terminal expression. A terminal expression is the last time the interpret method gets called.

          And finally, there is a client which will create instances of expressions to interpret the context.
          This structure makes it easy to extend and implement the grammar.
          However, the interpreter pattern works best when the grammar being interpreted is simple.
          Complex grammars can be difficult to maintain because you would need a new expression class for every new rule you introduce.
    * */
}
