public class TestCircle extends Circle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(3.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        // new constructor
        Circle c3 = new Circle(4.0, "green");
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c3.getArea());
        //getter
        System.out.println("The color of the circle is : " + c3.getColor());
        // setter
        c3.setRadius(6.0);
        c3.setColor("pink");
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of" + c3.getArea());
        System.out.println("The color of the circle is : " + c3.getColor());
        // toString
        System.out.println(c3);

    }
}
