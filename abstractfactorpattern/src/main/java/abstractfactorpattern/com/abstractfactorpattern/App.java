package abstractfactorpattern.com.abstractfactorpattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        abstractfactory shapeFactory = FactoryProducer.getFactory(false);
        DrawShape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        DrawShape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        abstractfactory shapeFactory1 = FactoryProducer.getFactory(true);
        DrawShape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
       DrawShape shape4 = shapeFactory1.getShape("SQUARE");
       shape4.draw();
    }
}