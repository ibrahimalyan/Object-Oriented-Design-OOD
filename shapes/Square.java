package tar_bait1_2;

public class Square implements Shape {
    private double length;

    //Constructor
    public Square(double length) {
        this.length = length;
    }

    //Get method
    public double getLength() {
        return length;
    }

    @Override
    //Print the area of the shape
    public void printArea(Shape sh) {
        GeoCalculator gc = new GeoCalculator();
        System.out.println("Square area is: " + gc.calcSquareArea((Square) sh) + ".");
    }

    @Override
    //Print the perimeter of the shape
    public void printPerimeter(Shape sh) {
        GeoCalculator gc = new GeoCalculator();
        System.out.println("Square perimeter is: " + gc.calcSquarePerimeter((Square) sh) + ".");
    }
}
