package java_chobo.ch07.overriding;



public class Point4D extends Point3D {
  private int w;
  
  public String getLocation() {
	  return super.getLocation() + String.format(",w = %d", w);
  }
	
	
}
