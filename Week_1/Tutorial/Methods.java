package weblab;

class Methods {
  
    public static int max(double a, double b, double c) {
        double max = Integer.MIN_VALUE;
        if (a > max) max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return (int) max;
    }
  
}