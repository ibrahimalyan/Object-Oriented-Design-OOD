package tar_bait1_2;

public class GeoCalculator {
    //Square functions
    public double calcSquareArea(Square obj) {
        return obj.getLength() * obj.getLength();
    }

    public double calcSquarePerimeter(Square obj) {
        return 4 * obj.getLength();
    }

    //Circle functions
    public double calcCircleArea(Circle obj) {
        return Math.PI * Math.pow(obj.getRadius(), 2);
    }

    public double calcCirclePerimeter(Circle shape) {
        return 2 * Math.PI * shape.getRadius();
    }

    //Triangle functions
    public double calcTriangleArea(Triangle obj) {
        return (obj.getBase() * obj.getPerpendicular()) / 2;
    }

    public double calcTrianglePerimeter(Triangle obj) {
        return Math.sqrt(Math.pow(obj.getPerpendicular(), 2) + Math.pow(obj.getBase(), 2));
    }
}
