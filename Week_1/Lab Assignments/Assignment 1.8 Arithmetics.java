package weblab;

class Arithmetics {

    public static double max(double x, double y) {
        return Double.max(x,y);
    }

    public static double abs(double x) {
        return Math.abs(x);
    }

    public static double squared(double x) {
        return x*x;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((squared(x1-x2) + squared(y1-y2)));
    }
}