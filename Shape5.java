
abstract class Shape5 {
       protected String color;
    protected double size;

        public Shape(String color, double size) {
        this.color = color;
        this.size = size;
    }

      public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }
}

class Circle extends Shape5 {
    private double radius;


    public Circle(String color, double radius) {
        super(color, radius);
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape5 {
    
    private double side;

    public Square(String color, double side) {
        super(color, side);
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }


    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Triangle extends Shape5 {
  
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color, base); 
        this.base = base;
        this.height = height;
    }

 
    public double calculateArea() {
        return 0.5 * base * height;
    }


    public double calculatePerimeter() {
              return 3 * base;
    }
}

