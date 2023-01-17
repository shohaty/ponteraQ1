package Shapes;

import java.awt.Point;
import java.util.List;
import java.util.logging.Logger;


abstract class Shape {
    protected Point position;
    protected String color;
    protected List<Double> dimensions;
    Logger logger = Logger.getLogger(Shape.class.getName());
    public Shape(Point position, String color, List<Double> dimensions) {
        this.position = position;
        this.color = color;
        this.dimensions = dimensions;
    }


    public abstract void draw();
    @Override
    public abstract String toString();
}