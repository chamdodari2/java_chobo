package java_chobo.ch07.overriding;

public class Point3D  extends Point{
	int z;
	
	
	
	
	@Override  // 부모의 접근지정자 default 부터 오버라이딩 허용된다
	public String getLocation() {
	//	return String.format("%d", x,y,z)  //private로 접근권한 없으면 접근할수없다. /이건 안될때가 있다.
	//return String.format("%s, %d%n", super.getLocation(),z)  / 
	return super.getLocation() + String.format(",z = %d",z);  //상속받은곳이라 접근할수있어서 이게 더 편하다
		
	}

}
