package commandpattern.com.commandpattern;

public class lightsoffcmd implements command{
	  //reference to the light
	  light Light;
	  public lightsoffcmd(light Light){
	    this.Light = Light;
	  }
	  public void execute(){
	    Light.switchOff();
	  }
	}