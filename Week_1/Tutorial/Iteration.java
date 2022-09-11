class Iteration {
  
    public static void run(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        
        printNumbersUpToFor(10);
        
        printNumbersUpToWhile(10);
        
    }
    
    /** Prints the numbers from 1 up to N
    *  @param n - an integer value
    */
    public static void printNumbersUpToFor(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
        }
    }
    
    /** Prints the numbers from 1 up to N
    *  @param n - an integer value
    */
    public static void printNumbersUpToWhile(int n){
        int start = 1;
        while (start <= n) {
            System.out.println(start);
            start++;
        }
    }
  
}