import java.util.*;
public class Main1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side:");
double sideLength=Scanner.nextDouble();
Square square=new Square(sideLength);
double area=square.calculateArea();
double perimeter=square.calculatePerimeter();

System.out.println("Area of Square :"+ area);
System.out.println("Perimeter of Square:" + perimeter);
}
}
