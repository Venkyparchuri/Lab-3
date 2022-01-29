package FacadePattern;

public class CameraFacade {
	private Camera basic;
	private Camera hd;
	
	
	public CameraFacade() {
		basic = new BasicCamera();
		hd = new HDCamera();
	}
	
	
	public String BasicFeatures() {
		return basic.clickPhotos();
	}
	public String HDFeatures() {
		return hd.clickPhotos();
	}
	
}
