package Ch08Ex;

class TV {
	// 속성
	private String brand;
	private int year;
	private int inch;
	// 기능
	public TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n", this.brand, this.year, this.inch);
	}
	
}


public class C00문제풀이1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
	}

}
