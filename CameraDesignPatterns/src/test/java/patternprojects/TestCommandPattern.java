package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CommandPattern.Command;
import CommandPattern.CameraInvoker;

import CommandPattern.CandidCameraVideo;
import CommandPattern.NormalCameraVideo;


class TestCommandPattern {

	@Test
	void testCandid() {
			CameraInvoker invoker = new CameraInvoker();
		    Command candid = new CandidCameraVideo();

		    invoker.setCommand(candid);
		    invoker.pressButton();
		 
		 //Invoker invokes command 
		 assertEquals(false, invoker.pressButton());
	}


	@Test
	void testNormal() {
			CameraInvoker invoker = new CameraInvoker();
		    Command normal = new NormalCameraVideo();
		    
			invoker.setCommand(normal); 
			invoker.pressButton();
			 
		 
		 //Invoker invokes command 
		 assertEquals(true, invoker.pressButton());
	}

	

}
