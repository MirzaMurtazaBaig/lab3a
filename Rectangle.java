package Task2;

public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length with validation
    public void setLength(double length) {
        validateDimension(length);
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width with validation
    public void setWidth(double width) {
        validateDimension(width);
        this.width = width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Validation method for dimensions
    private void validateDimension(double value) {
        if (value <= 0.0 || value >= 20.0) {
            throw new IllegalArgumentException("Length and width must be greater than 0 and less than 20.");
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        System.out.println("Default Rectangle:");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Area: " + rect.calculateArea());

        // Testing with valid dimensions
        rect.setLength(5.0);
        rect.setWidth(10.0);

        System.out.println("\nUpdated Rectangle:");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Area: " + rect.calculateArea());

        // Uncommenting the next line will throw an exception
        // rect.setLength(25.0); // Should throw IllegalArgumentException
    }
}
