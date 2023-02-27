public class SimpleCircle {
    public static void main(String[] args) {
        SimpleCircle ct1 = new SimpleCircle();
        System.out.println("The area of the circle of radius: " + ct1.radius + " is " + ct1.getArea());

        SimpleCircle ct2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius: " + ct2.radius + " is " + ct2.getArea());

        SimpleCircle ct3 = new SimpleCircle(100);
        System.out.println("The area of the circle of radius: " + ct3.radius + " is " + ct3.getArea());
    }

    double radius;

    SimpleCircle() {
        radius = 1;
    }

    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
