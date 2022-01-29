package FacadePattern;

public class FacadeDemo {

	public static void main(String[] args) {
		CameraFacade house = new CameraFacade();
		
		house.BasicFeatures();
		house.HDFeatures();
	

	}

}
