package Bai15;

public class Rectangle {
	private int width ;
	private int length;
	private int x;
	private int y;
	
	public Rectangle(int width, int length, int x, int y) {
		this.length = length;
		this.width = width;
		this.x = x;
		this.y = y;
		
	}
	public static String check(Rectangle a, Rectangle b ) {
		if(Math.abs(a.x - b.x) < (a.length - b.length) / 2
			&& Math.abs(a.y - b.y) < (a.width - b.width) / 2) {
			return "Trong nhau";
			
		}
		else if (Math.abs(a.x - b.x) < (a.length + b.length) / 2
				&& Math.abs(a.y - b.y) < (a.width + b.width) / 2) {
			return "giao nhau";
		}
		else return "khong giao nhau";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var hinh1 = new Rectangle(30,40,4,10);
		var hinh2 = new Rectangle(10,20,6,14);
		System.out.println(Rectangle.check(hinh1, hinh2));
	}

}
