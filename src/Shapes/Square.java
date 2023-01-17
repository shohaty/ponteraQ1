package Shapes;
import java.awt.Point;
import java.util.Arrays;
import java.util.List;
public class Square extends Shape {
    protected int side;
    public Square(Point position, String color, int side) {
        super(position, color, Arrays.asList(side*1.0, side*1.0));
        this.side = side;
        logger.info("Square created");
    }
    @Override
    public void draw() {
        // here we draw the square
        logger.info("Square drawn with side " + side + " at position " + position + " with color " + color);
    }
    @Override
    public String toString() {
        return "Square: Position=" + position + ", Color=" + color + ", Dimensions=" + dimensions;
    }
}