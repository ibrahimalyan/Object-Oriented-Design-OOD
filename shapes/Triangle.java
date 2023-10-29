package tar_bait1_2;

public class Triangle implements Shape {
    private double perpendicular;
    private double base;

    //Constructor
    public Triangle(double perpendicular, double base) {
        this.perpendicular = perpendicular;
        this.base = base;
    }

    //Get methods
    public double getPerpendicular() {
        return perpendicular;
    }

    public double getBase() {
        return base;
    }

    @Override
    //Print the area of the shape
    public void printArea(Shape sh) {
        GeoCalculator gc = new GeoCalculator();
        System.out.println("Triangle area is: " + gc.calcTriangleArea((Triangle) sh) + ".");
    }

    @Override
    //Print the perimeter of the shape
    public void printPerimeter(Shape sh) {
        GeoCalculator gc = new GeoCalculator();
        System.out.println("Triangle perimeter is: " + gc.calcTrianglePerimeter((Triangle) sh) + ".");
    }
}
