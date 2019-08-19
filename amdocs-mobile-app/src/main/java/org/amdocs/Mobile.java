package org.amdocs;

public class Mobile {
	
	private Camera camera;
	
	public Mobile() {
		camera = new Camera();
	}
	public Mobile(Camera camera) {
		this.camera= camera;
	}
	
	public boolean startPhotoApp() {
		System.out.println("inside start photo app method");
		
		if( camera.on()) {
			System.out.println("positive code path");
			System.out.println("assume some hardwre interaction");
		return true;
		}
		System.out.println("Negative code path");
		System.out.println("assume some exception handling and error log happens here");
		return false;
	}

}
