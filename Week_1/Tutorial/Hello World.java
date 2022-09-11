package weblab;

class HelloWorld {
  
    public static void run() {
        /*****
         * Right now we're inside of the "run" method inside of the "HelloWorld" class.
         * These two concepts will be explained more in the coming weeks, but for now 
         * you just need to know that any code you write needs to be inside of a method, 
         * and a method needs to be inside a class. For the time being we will provide 
         * a class and method for you to work in, so you can focus on writing some code!
         * Let's look at what the two lines of code below do.
         *****/

        /*****
        * String  <-- Data type
        * world   <-- 'variable', a named memory location
        * =       <-- Assignment operator (the value on the right side gets assigned 
        *            to the variable on the left)
        * ""      <-- An empty String.
        ******/
        String world = "";
        
        /*****
        * System.out.println() <-- Java's print to console method
        * "Hello: "            <-- A String
        * +                    <-- An operator that concatenates two strings together
        * name                 <-- variable that refers to an object with type String
        ******/
        System.out.println("Hello " + "World");
        
    }
  
}