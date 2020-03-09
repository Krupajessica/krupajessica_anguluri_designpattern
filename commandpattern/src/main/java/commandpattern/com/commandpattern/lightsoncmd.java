package commandpattern.com.commandpattern;

public class lightsoncmd implements command{
	  //reference to the light
	  light Light;
	  public lightsoncmd(light Light){
	    this.Light = Light;
	  }
	  public void execute(){
	    Light.switchOn();
	  }
	}
