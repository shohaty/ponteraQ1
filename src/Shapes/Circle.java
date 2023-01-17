package Shapes;
import java.awt.Point;
import java.util.Arrays;
import java.util.List;
public class Circle extends Shape
{
    protected int radius;
    public Circle(Point position, String color, int radius) {
        super(position, color, Arrays.asList(radius*1.0));
        this.radius = radius;
        logger.info("Circle created");

    }
    @Override
    public void draw() {
        // here we draw the circle
        logger.info("Circle drawn with radius " + radius + " at position " + position + " with color " + color);

    }
    @Override
    public String toString() {
        return "Circle: Position=" + position + ", Color=" + color + ", Dimensions=" + dimensions;
    }
}