package Bai15;

public class GiaiPT {
	private int a;
	private int b;
	private int c;
	
	private double delta;
	
	public GiaiPT(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public void setDelta() {
		 this.delta = this.b * this.b - 4 * a * c;
	}
	public void giai() {
		if(this.delta >= 0) {
			double nghiem1 = (-this.b + Math.sqrt(this.delta)) / 2;
			double nghiem2 = (-this.b - Math.sqrt(this.delta)) / 2;
			System.out.println(" Phuong trinh co 2 nghiem la" + nghiem1 +"va" + nghiem2  );
		}
		else System.out.println("pt vo nghiem");
			
	}
}
