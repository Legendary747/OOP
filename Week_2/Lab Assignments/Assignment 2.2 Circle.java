package weblab;

class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius < 0 ? 0 : radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public double getRadius() {
        return this.radius;
    }

    public String toString() {
        return "<Circle(" + this.center.toString() + ", " + this.radius + ")>";
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other instanceof Circle) {
            Circle that = (Circle) other;
            return (this.center.equals(that.center) && this.radius == that.radius);
        } else {
            return false;
        }
    }

    public double circumference() {
        return this.radius*2*Math.PI;
    }

    public double surface() {
        return this.radius*this.radius*Math.PI;
    }

    public void translate(double dx, double dy) {
        this.center.translate(dx, dy);
    }

    public boolean overlappingWith(Circle other) {
        if (this.center.distance(other.center) <= this.radius+other.radius) {
            return true;
        }
        return false;
    }
}