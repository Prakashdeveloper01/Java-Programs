public class Main9 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 8);
        Square square = new Square("Blue", 6);
        Triangle triangle = new Triangle("Green", 9, 6);

        // Only calculate area for shapes, as perimeter might not be applicable
        System.out.println("Circle - Color: " + circle.getColor() + ", Area: " + circle.calculateArea());
        System.out.println("Square - Color: " + square.getColor() + ", Area: " + square.calculateArea());
        System.out.println("Triangle - Color: " + triangle.getColor() + ", Area: " + triangle.calculateArea());
    }
}
