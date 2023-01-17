## pontera Q1 - Shape drawing system
This drawing system is designed to create and draw different shapes using an abstract Shape class and its subclasses: Rectangle, Circle, and Square.

### Shape Class ★
#### The Shape class is the abstract base class for all shapes and contains the following properties:

    position: a Point object representing the position of the shape
    color: a String representing the color of the shape
    dimensions: a List<Double> representing the dimensions of the shape
    logger: a Logger object for logging

### Rectangle Class 
#### The Rectangle class extends the Shape class and contains the following additional properties:

    width: an int representing the width of the rectangle
    height: an int representing the height of the rectangle
    
### Circle Class
#### The Circle class extends the Shape class and contains the following additional property:

    radius: an int representing the radius of the circle
    
### Square Class
#### The Square class extends the Shape class and contains the following additional property:

    side: an int representing the side of the square

#### 🌐 Technicals
   * Written in Java
