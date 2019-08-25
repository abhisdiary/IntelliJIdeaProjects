public class Cylinder {
    private double height, radius;

    public Cylinder() {
        setHeight(1);
        setRadius(1);
    }

    public Cylinder(double height, double radius) {
        setRadius(radius);
        setHeight(height);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double volume() {
        double height = getHeight();
        double radius = getRadius();
        return Math.PI * Math.pow(radius, 2) * height;
    }

}
