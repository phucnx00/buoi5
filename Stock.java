package Bai15;

public class Stock {
	private String stockID;
	private String stockName;
	private double  previousClosingPrice;
	private double currentPrice;
	
	public Stock(String stockID, String stockName) {
		this.stockID = stockID;
		this.stockName = stockName;
	}
	
	public void setStock(double previousClosingPrice, double currentPrice ) {
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice ;
	}
	
	public double  getChangePercent() {
		return this.previousClosingPrice / this.currentPrice /100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var stock = new Stock( "SSI"," CTY chung khoan");
		stock.setStock(34.5, 35);
		System.out.println(stock.getChangePercent());
		
	}

}
