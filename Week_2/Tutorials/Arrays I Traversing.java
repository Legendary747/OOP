class ArraysTutorial {
  
  public static void run() {
    // Declare, initialize and bind an array with five spaces.
    int[] numbers = new int[5];
    
    // Fill the array with the numbers 1 through 5.
    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }
    
    // Print the number in the 4th position.
    System.out.println(numbers[3]);
  
  }
  
  /**Find and return the lowest number in the input array.
   * @param numbers - an array that contains int values
   * @return the lowest number in the input array, or Integer.MAX_VALUE if the array has length 0.
   */ 
  public static int min(int[] numbers) {
    int min = Integer.MAX_VALUE;
    int s = numbers.length;
    for (int i = 0 ; i < s; i++) {
      if (numbers[i] < min) min = numbers[i];
    }
    return min;
  }
  
  /**Indicates whether a specific int value is present in the input array.
   * @param numbers - an array that contains int values
   * @param n - an int value
   * @return a boolean value that is true when n is present in numbers, else otherwise.
   */ 
  public static boolean contains(int[] numbers, int n) {
    int s = numbers.length;
    for (int i = 0 ; i < s ; i++) {
      if (numbers[i] == n) return true;
    }
    return false;
  }
  
}