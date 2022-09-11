class Filtering {
  
  /** Returns the number of positive int numbers in the array. 
   * A number is positive when it is greater than 0.
   * @param numbers - the input array with numbers.
   * @return the number of positive numbers in numbers.
   */
  public static int countPositives(int[] numbers){
    int cnt = 0;
    for (int i = 0 ; i < numbers.length ; i++) {
      if (numbers[i] > 0) cnt++;
    }
    return cnt;
  }
  
  /** Filters the input array and returns an array that exactly contains the 
   * positive numbers in the input array (without additional empty spaces).
   * @param numbers - the input array with numbers.
   * @return An array that contains only the positive numbers in numbers.
   */
  public static int[] filterPositives(int[] numbers){
   int s = countPositives(numbers);
   int[] p = new int[s];
   int pp = 0;
   for (int i = 0 ; i < numbers.length; i++) {
     if (numbers[i] > 0) p[pp++] = numbers[i];
   }
   return p;
  }
}