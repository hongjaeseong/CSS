package Ch12_Ex;

import Ch01.C02SystemOut;

class Pen{
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
class SharpPencil extends Pen{
	private int width;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
class Ballpen extends Pen{
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
class FountainPen extends Ballpen{
	public void refill(int n) {
		setAmount(n);
	}
}


public class C05Ex {
	public static void main(String[] args) {
	
		Pen pen1 = new Pen();
		pen1.setAmount(100);
		System.out.println(pen1.getAmount());
		
		SharpPencil pen2 = new SharpPencil();
		pen2.setAmount(200);
		System.out.println(pen2.getAmount());
		pen2.setWidth(50);
		System.out.println(pen2.getWidth());
		
		Ballpen pen3 = new Ballpen();
		pen3.setColor("red");
		System.out.println(pen3.getColor());
		
		FountainPen pen4 = new FountainPen();
		pen4.refill(5);
		System.out.println(pen4.getAmount());
		
		Ballpen pen5 = pen4;		// UpCasting
//		pen5.refill(5);
		pen5.setColor("blue");
		System.out.println(pen5.getColor());
		if(pen5 instanceof FountainPen) {
			FountainPen pen6 = (FountainPen) pen5;		// DownCasting
			pen6.refill(999);
			System.out.println(pen6.getAmount());
		}
		System.out.println(pen5.getAmount());
		
		
		
		

	}

}
