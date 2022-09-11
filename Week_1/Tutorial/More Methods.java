package weblab;

class Methods {
  
    /**Returns the largest number of the input values.
    * @param x - a double value
    * @param y - a double value
    * @param z - a double value
    * @return the largest number out of x, y and z.
    */
    public static double max(double x, double y, double z) {
        if (x >= y && x >= z) {
            return x;
        }
        if (y >= z && y >= x) {
            return y;
        }
        else {
            return z;
        }
    }
  
    public static int sum(int x, int y , int z) {
        return x + y + z;
    }
    
    public static int min(int x, int y, int z) {
        int min = Integer.MAX_VALUE;
        if (x < min) min = x;
        if (y < min) min = y;
        if (z < min) min = z;
        return min;
    }

    public static boolean sumGreaterThan(int x, int y , int c) {
        // return x + y > c; 
        // can use this immediately, just refreshing my memo with the operators
        return (x + y > c) ? true : false;
    }
  
}