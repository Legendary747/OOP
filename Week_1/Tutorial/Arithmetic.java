package weblab;

class Arithmetic {
  
    /**Returns the integer 42 regardless of the input value.
    * @param i - an integer value
    * @return the value 42
    */
    public static int fourtyTwo(int i) {
        i = 42;
        return i;
    }

    /**Increments the value of the provided integer by 1 and returns the result.
    * @param i - an integer value
    * @return the incremented int
    */
    public static int increment(int i) {
        return ++i; // <-- Replace this line with your solution.
    }
    
    /**Multiplies the values of the provided integers with each other and returns the result.
    * @param i - an integer value
    * @param j - an integer value
    * @return the multiplication of i and j
    */
    public static int multiply(int i, int j) {
        return i*j; // <-- Replace this line with your solution.
    }  
    
    /**Divides the value of integer i and integer j and returns the resulting value as a double.
    * @param i - an integer value
    * @param j - an integer value
    * @return the division of i and j (as a double)
    */
    public static double divide(int i, int j) {
        return ((double) i) / j; // <-- Replace this line with your solution.
    }  

    /**Adds the values of  i and j and returns the multiplication of this sum and k.
    * @param i - an integer value
    * @param j - an integer value
    * @param k - an integer value
    * @return The sum of i and j, which is subsequently multiplied with k.
    */
    public static int addThenMultiply(int i, int j, int k) {
        return (i+j) * k;
    }  
  
}