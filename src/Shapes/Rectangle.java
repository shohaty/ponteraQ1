package Shapes;
import java.awt.Point;
import java.util.Arrays;
import java.util.List;
public class Rectangle extends Shape {
    protected int width, height;
    public Rectangle(Point position, String color, int width, int height) {
        super(position, color, Arrays.asList(width*1.0, height*1.0));
        this.width = width;
        this.height = height;
        logger.info("Rectangle created");
    }
    @Override
    public void draw()
    {
        //draw the rectangle
        logger.info("Rectangle drawn with width " + width + " and height " + height + " at position " + position + " with color " + color);


    }
    @Override
    public String toString() {
        return "Rectangle: Position=" + position + ", Color=" + color + ", Dimensions=" + dimensions;
    }
}
