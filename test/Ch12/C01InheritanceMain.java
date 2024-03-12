//package Ch12;
//
//class Point2D{
//	int x;
//	int y;
//	
//	Point2D(){
//		System.out.println("Point2D() 생성자 호출!");
//	}
//	
//	@Override
//	public String toString() {
//		return "Point2D [x=" + x + ", y=" + y + "]";
//	}
//	
//}
//class Point3D extends Point2D{
//	int z;
//
//	Point3D(){
//		super();										// super() : 생략해도 default 로 들어가있음, 상위클래스 Point2D() 생성자 호출!
//		System.out.println("Point3D() 생성자 호출!");
//	}
//	
//	@Override
//	public String toString() {
//		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
//	}
//	
//}
//
//
//
//public class C01InheritanceMain {
//	public static void main(String[] args) {
//
//		Point3D ob = new Point3D();		// 상속관계에 있는 상위클래스의 생성자를 먼저 호출하고 'super()' 필요한 공간(멤버변수)을 확보하고 난 뒤 하위클래스의 생성자를 호출한다 		
//		// Point2D() 생성자 호출!
//		// Point3D() 생성자 호출! 
//		ob.x = 100;
//		ob.y = 200;
//		ob.z = 300;
//		System.out.println(ob);
//		
//	}
//
//}
