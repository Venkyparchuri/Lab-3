package CommandPattern;

public class CameraInvoker {
	 private Command command;
	  public void setCommand(Command command){
	    this.command = command;
	  }
	  public boolean pressButton(){
	    return command.click();
	  }
}
