package Bai15;

public class TV {
	private int channel;
	private boolean on;
	private int volumn;
	
	public TV() {
		
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void increaseChannel() {
		channel++; 
	}
	
	public void decreaseChannel() {
		channel--;
	}
	
	public void increaseVolumn() {
		volumn++;
	}
	
	public void decreaseVolumn() {
		volumn--;
	}
	
	public void setChannel(int channel) {
		if(channel >=1 ) {
			this.channel = channel;
		}
		else System.out.println("Nhap kenh lon hon 1");
	}
	
	public void setVolumn(int volumn) {
		if(volumn >=0 ) {
			this.volumn = volumn;
		}
		else System.out.println("Nhap volumn lon hon 0");
	}
	
	public int getChannel() {
		return this.channel;
	}
	
	public int getVolumn() {
		return this.volumn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv= new TV();
		tv.setChannel(12);
		tv.setVolumn(1);
		tv.increaseChannel();
		tv.decreaseVolumn();
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolumn());
	}

}
