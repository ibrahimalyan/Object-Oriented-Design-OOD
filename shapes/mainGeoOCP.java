package tar_bait1_2;

import java.util.ArrayList;

public class mainGeoOCP {
    public static void main(String[] args) {
        ArrayList<Shape> objects = new ArrayList<>();
        Triangle tr1 = new Triangle(6, 2);
        Circle cr1 = new Circle(5);
        Square sq1 = new Square(5);
        objects.add(tr1);
        objects.add(cr1);
        objects.add(sq1);
        GeoCalculatorOCP gc1 = new GeoCalculatorOCP();
        System.out.println("Testing GeoCalculatorOCP:");
        System.out.println("Triangle area: " + gc1.calcTriangleArea(tr1) + " perimeter: " + gc1.calcTrianglePerimeter(tr1));
        System.out.println("Circle area: " + gc1.calcCircleArea(cr1) + " perimeter: " + gc1.calcCirclePerimeter(cr1));
        System.out.println("Square area: " + gc1.calcSquareArea(sq1) + " perimeter: " + gc1.calcSquarePerimeter(sq1));
        gc1.printAreaSum(objects);
        gc1.printPerimeterSum(objects);
        System.out.println();

        gc1.writeToFile(tr1);
        gc1.writeToFile(cr1);
        gc1.writeToFile(sq1);
    }
}
