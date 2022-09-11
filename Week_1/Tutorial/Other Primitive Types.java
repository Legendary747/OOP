package weblab;

class PrimitiveTypes {
  
    public static void run(){
        boolean bool = false;
        System.out.println("The value of the boolean is: " + bool);
        
        char a = 'a';
        char b = 'b';
        char c = 'c';
        String s = "These characters have been appended to a String: " + a + b + c;
        System.out.println(s);
    }
  
    /** Method that inverts the value of the provided boolean.
     *  @param b - boolean value.
     *  @return the inverse of boolean b.
     */
    public static boolean invert(boolean b) {
        return !b; // <-- Replace this line with your solution.
    }

    /** Method that always returns the character for the Japanese Yen.
     *  @return the character for yen.
     */
    public static char yenSupplier() {
        char yen = 165;
        return yen; // <-- Replace this line with your solution.
    }

}