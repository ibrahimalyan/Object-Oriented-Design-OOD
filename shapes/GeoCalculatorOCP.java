package tar_bait1_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class GeoCalculatorOCP extends GeoCalculator {
    //Print the sum of the areas of all the shapes in the list
    public void printAreaSum(ArrayList<Shape> obj) {
        double sum = 0;
        for (Shape shape : obj) {
            if (shape instanceof Circle) {
                sum += calcCircleArea((Circle) shape);
            }
            if (shape instanceof Square) {
                sum += calcSquareArea((Square) shape);
            }
            if (shape instanceof Triangle) {
                sum += calcTriangleArea((Triangle) shape);
            }
        }
        System.out.println("The sum of the area of all shapes is: " + sum);
    }

    //Print the sum of the perimeters of all the shapes in the list
    public void printPerimeterSum(ArrayList<Shape> obj) {
        double sum = 0;
        for (Shape shape : obj) {
            if (shape instanceof Circle) {
                sum += calcCirclePerimeter((Circle) shape);
            }
            if (shape instanceof Square) {
                sum += calcSquarePerimeter((Square) shape);
            }
            if (shape instanceof Triangle) {
                sum += calcTrianglePerimeter((Triangle) shape);
            }
        }
        System.out.println("The sum of the perimeter of all shapes is: " + sum);
    }

    //Serialize the shape to a file
    public void writeToFile(Shape sh) {
        try {
            Writer file;
            file = new BufferedWriter(new FileWriter("Serializable.txt", true));
            String buffer = "";
            if (sh instanceof Circle) {
                buffer += "Circle: \n";
                buffer += "The radius is: " + ((Circle) sh).getRadius() + "\n";
                buffer += "The area is: " + calcCircleArea((Circle) sh) + "\n";
                buffer += "The perimeter is: " + calcCirclePerimeter((Circle) sh) + "\n\n";
            }
            if (sh instanceof Square) {
                buffer += "Square: \n";
                buffer += "The length is: " + ((Square) sh).getLength() + "\n";
                buffer += "The area is: " + calcSquareArea((Square) sh) + "\n";
                buffer += "The perimeter is: " + calcSquarePerimeter((Square) sh) + "\n\n";
            }
            if (sh instanceof Triangle) {
                buffer += "Triangle: \n";
                buffer += "The Perpendicular length is: " + ((Triangle) sh).getPerpendicular() + "\n";
                buffer += "The Base length is: " + ((Triangle) sh).getBase() + "\n";
                buffer += "The area is: " + calcTriangleArea((Triangle) sh) + "\n";
                buffer += "The perimeter is: " + calcTrianglePerimeter((Triangle) sh) + "\n\n";
            }
            file.append(buffer);
            file.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
