import com.calculateArea.circle;
import com.calculateArea.square;
import com.calculateArea.triangle;

public class Main {
    public static void main(String[] args) {

        square square = new square(4,5);
        circle circle = new circle(5);
        triangle triangle = new triangle(4,6);
        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Area of triangle: " + triangle.calculateArea());

    }
}