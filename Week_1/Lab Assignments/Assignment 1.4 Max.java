package weblab;

class Assignment1_4 {
  
    public static int max(int x, int y, int z){ 
        if (x == y || y == z || x == z) return -1;
        int max = Integer.MIN_VALUE;
        if (x > max) max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }
  
}