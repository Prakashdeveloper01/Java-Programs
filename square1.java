import java.util.Scanner;

class Square1{
    double side;


    Square(double side) {
        this.side = side;
    }
    double calculateArea() {
        return side * side;
    }


    double calculatePerimeter() {
        return 4 * side;
    }
}


