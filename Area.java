public class Area
 {
    
   
    public double calculateTriangle(double base, double height) {
        return 0.5 * base * height;
    }
    
    
    public double calculateRectangle(double length, double width) {
        return length * width;
    }
    
    
    public double calculateCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Area calculator = new Area();

        
        double triangleArea = calculator.calculateTriangle(5, 10);
        double rectangleArea = calculator.calculateRectangle(4, 6);
        double circleArea = calculator.calculateCircle(3);

        System.out.println("Area of triangle: " + triangleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of circle: " + circleArea);
    }
}