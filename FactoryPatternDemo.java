

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class ShapeFactory {
   
    private static ShapeFactory instance;


    private ShapeFactory() {
    }

   
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
public class FactoryPatternDemo {
    public static void main(String[] args) {
       
        ShapeFactory shapeFactory = ShapeFactory.getInstance();

     
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        if (shape1 != null) {
            shape1.draw();
        }

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        if (shape2 != null) {
            shape2.draw();
        }
    }
}


