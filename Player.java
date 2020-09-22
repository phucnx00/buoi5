package Bai15;

public class Player {
	private String[] luaChon = {"keo","bua","la"};
	private int diemSo;
	
	public String getLuaChon() {
		String x = this.luaChon[(int)(Math.random()*3)];
		return x;
	}
	
	public static void kiemTra(Player nguoi, Player may) {
		for(int i = 0; i < 3; i ++) {
			nguoi.getLuaChon();
			may.getLuaChon();
			if (nguoi.getLuaChon() == "keo" && may.getLuaChon() == "bua"
					|| nguoi.getLuaChon() == "bua" && may.getLuaChon() == "la"
					|| nguoi.getLuaChon() == "la" && may.getLuaChon() == "keo") {
				nguoi.diemSo++;
				System.out.println("nguoi chon " + nguoi.getLuaChon() +" " + "may chon " + may.getLuaChon());
			}
			
			
			else if (nguoi.getLuaChon() == "la" && may.getLuaChon() == "bua"
					|| nguoi.getLuaChon() == "bua" && may.getLuaChon() == "keo"
					|| nguoi.getLuaChon() == "keo" && may.getLuaChon() == "la") {
				System.out.println("nguoi chon " + nguoi.getLuaChon() +" " + "may chon " + may.getLuaChon());
				nguoi.diemSo++;
			}
		}
		if ( nguoi.diemSo > may.diemSo) System.out.println("nguoi wins");
		else if (nguoi.diemSo < may.diemSo) System.out.println("nguoi loses");
		else System.out.println("hoa");
	}
	
	
}
