package weblab;

class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String toString() {
        return "<Point(" + this.x + ", " + this.y + ")>";
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distance(Point other) {
        double ox = other.getX();
        double oy = other.getY();
        return Math.sqrt((this.x - ox)*(this.x - ox) + (this.y - oy)*(this.y - oy));
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other instanceof Point) {
            Point that = (Point) other;
            return this.x == that.x && this.y == that.y;
        } else {
            return false;
        }
    }

}