package Ch12;

class Point2D{
	int x;
	int y;
	
	Point2D(){
		System.out.println("Point2D() 생성자 호출!");
	}
	Point2D(int x){
		this.x = x;
		System.out.println("Point2D(int x) 생성자 호출!");
	}
	Point2D(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Point2D(int x, int y) 생성자 호출!");
	}
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}
class Point3D extends Point2D{
	int z;

	Point3D(){
		super();														// Point2D() 생성자 호출!
		System.out.println("Point3D() 생성자 호출!");
	}
	Point3D(int x){
		super(x);														// Point2D(int x) 생성자 호출!
		System.out.println("Point3D(int x) 생성자 호출!");
	}
	Point3D(int x, int y){
		super(x, y);													// Point2D(int x, int y) 생성자 호출!
		System.out.println("Point3D(int x, int y) 생성자 호출!");
	}
	Point3D(int x, int y, int z){										// Point2D(int x, int y) 생성자 호출!
		super(x, y);
		this.z = z;
		System.out.println("Point3D(int x, int y, int z) 생성자 호출!");
	}
	
	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	
}


public class C02InheritanceMain {
	public static void main(String[] args) {

		Point3D ob1 = new Point3D();		// 상속관계에 있는 상위클래스의 생성자를 먼저 호출하고 'super()' 필요한 공간(멤버변수)을 확보하고 난 뒤 하위클래스의 생성자를 호출한다 		
		// Point2D() 생성자 호출!
		// Point3D() 생성자 호출! 
		ob1.x = 100;
		ob1.y = 200;
		ob1.z = 300;
		System.out.println(ob1);
		System.out.println("------------------");
		Point3D ob2 = new Point3D(1);
		System.out.println(ob2);
//		Point2D(int x) 생성자 호출!
//		Point3D(int x) 생성자 호출!
//		Point3D [z=0, x=1, y=0]
		System.out.println("------------------");
		Point3D ob3 = new Point3D(1,2);
		System.out.println(ob3);
//		Point2D(int x, int y) 생성자 호출!
//		Point3D(int x, int y) 생성자 호출!
//		Point3D [z=0, x=1, y=2]
		System.out.println("------------------");
		Point3D ob4 = new Point3D(1,2,3);
		System.out.println(ob4);
//		Point2D(int x, int y) 생성자 호출!
//		Point3D(int x, int y, int z) 생성자 호출!
//		Point3D [z=3, x=1, y=2]
		
		
		
	}

}
