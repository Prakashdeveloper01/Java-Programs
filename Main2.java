import java.util.Scanner; 
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side length of the square:");
        double sideLength = scanner.nextDouble();
        Square square = new Square(sideLength);

        double area = square.calculateArea();
        System.out.println("Area of the square: " + area);
	double perimeter = square.calculatePerimeter();
        System.out.println("Perimeter of the square: " + perimeter);

        scanner.close();
    }
}
