package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FacadePattern.CameraFacade;


class TestFacadePattern {

	@Test
	void testCameraBasic() {
		CameraFacade house = new CameraFacade();
		
		house.BasicFeatures();
		
		
		assertEquals("BasicPhotos",house.BasicFeatures());
	}

	@Test
	void testHDCamera() {
		CameraFacade house = new CameraFacade();
		
		house.HDFeatures();
		
		
		assertEquals("HDPhotos", house.HDFeatures());
	}
	

	

}
