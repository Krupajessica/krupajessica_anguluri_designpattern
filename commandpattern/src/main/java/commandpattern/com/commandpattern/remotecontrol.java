package commandpattern.com.commandpattern;

public class remotecontrol{
	  private command Command;
	  public void setCommand(command Command){
	    this.Command = Command;
	  }
	  public void pressButton(){
	    Command.execute();
	  }
	}
