import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        //create a circle
        Point positionCircle = new Point(5, 5);
        Circle circle = new Circle(positionCircle, "Red", 5);
        //create Logger to inform that the circle was created
        circle.draw();

        //create a rectangle
        Point positionRectangle = new Point(10, 10);
        Rectangle rectangle = new Rectangle(positionRectangle, "Blue", 10, 5);
        rectangle.draw();

        //create a square
        Point positionSquare = new Point(15, 15);
        Square square = new Square(positionSquare, "Green", 10);
        square.draw();

    }
}