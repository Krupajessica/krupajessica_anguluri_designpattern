package commandpattern.com.commandpattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {remotecontrol Control = new remotecontrol();
    light Light = new light();
    command lightsOn = new lightsoncmd(Light);
    command lightsOff = new lightsoffcmd(Light);
    Control.setCommand(lightsOn);
    Control.pressButton();
    Control.setCommand(lightsOff);
    Control.pressButton();
    }
}
