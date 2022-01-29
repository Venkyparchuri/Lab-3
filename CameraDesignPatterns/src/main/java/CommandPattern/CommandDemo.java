package CommandPattern;

public class CommandDemo {

	public static void main(String[] args) {
		 CameraInvoker invoker = new CameraInvoker();
		    Command commercial = new NormalCameraVideo();
		    Command domestic = new CandidCameraVideo();

		    
		    invoker.setCommand(commercial);
		    invoker.pressButton();


		    invoker.setCommand(domestic);
		    invoker.pressButton();

	}

}
