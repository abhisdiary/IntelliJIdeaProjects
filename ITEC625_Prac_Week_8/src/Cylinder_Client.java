public class Cylinder_Client {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(4.7, 2.5);
        System.out.println(c1.volume());
        c1.setRadius(c1.getRadius() + 2.1);
        System.out.println(c1.volume());
    }

}
