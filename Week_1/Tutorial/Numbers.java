package weblab;

class Numbers {
  
    public static void run() {
        // Declare two variables of different types and assign the a value to both.
        int i = Integer.MAX_VALUE;
        long l = Integer.MAX_VALUE;

        // Print the initial values of both variables.
        System.out.println("The value of the int is: " + i);
        System.out.println("The value of the long is: " + l);

        // Increment the value of i by 1.
        i = i + 1;
        System.out.println("The value of the incremented int is: " + i);
        
        // Increment the value of l by 1.
        l++;
        System.out.println("The value of the incremented long is: " + l);
    }
}