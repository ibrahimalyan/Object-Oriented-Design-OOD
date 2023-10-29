package tar_bait1_2;

public class Circle implements Shape {
    private double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Get method
    public double getRadius() {
        return radius;
    }

    @Override
    //Print the area of the shape
    public void printArea(Shape sh) {
        GeoCalculator gc = new GeoCalculator();
        System.out.println("Circle area is: " + gc.calcCircleArea((Circle) sh) + ".");
    }

    @Override
    //Print the perimeter of the shape
    public void printPerimeter(Shape sh) {
        GeoCalculator gc = new GeoCalculator();
        System.out.println("Circle perimeter is: " + gc.calcCirclePerimeter((Circle) sh) + ".");
    }
}
