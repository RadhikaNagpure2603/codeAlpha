package simulator;

public class Stock {

		    private String symbol;
		    private double price;

		    public Stock(String symbol, double price) {
		        this.symbol = symbol;
		        this.price = price;
		    }

		    public String getSymbol() {
		        return symbol;
		    }

		    public double getPrice() {
		        return price;
		    }

		    public void updatePrice() {
		        double change = (Math.random() - 0.5) * 10;
		        price = Math.max(1.0, price + change);
		    }

		    @Override
		    public String toString() {
		        return symbol + " : $" + String.format("%.2f", price);	
		    }
	}
