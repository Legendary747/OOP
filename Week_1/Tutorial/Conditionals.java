package weblab;

class Conditionals {
  
  
  /**Inverts the boolean value of the provided boolean.
   * @param b- a boolean value
   * @return the opposite boolean value of b.
   */
  public static boolean invert(boolean b) {
    return !b;
  }
  
  /**Returns a boolean value which indicates whether the input is positive or not.
   * @param i - an integer value
   * @return true if i is greater than 0, false otherwise
   */
  public static boolean isPositive(int i) {
    return i > 0;
  }
  
  /**Returns a boolean value which indicates whether the input equals 42 or not.
   * @param i - an integer value
   * @return true if i is exactly 42, false otherwise
   */
  public static boolean isFourtyTwo(int i) {
    return i == 42;
  }
  
  /**Returns a boolean value which indicates whether the input a valid grade.
   * @param i - an integer value
   * @return true if i is greater than 0, and smaller than or equal to 10
   */
  public static boolean isValidGrade(int i) {
    return i <= 10 && i > 0;
  }
}