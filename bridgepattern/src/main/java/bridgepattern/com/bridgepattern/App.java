package bridgepattern.com.bridgepattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Shape RedCircle = new Circle(100,100, 10, new RedCircle());
        Shape BlueCircle = new Circle(100,100, 10, new bluecircle());

        RedCircle.draw();
        BlueCircle.draw();
    }
}
