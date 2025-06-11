package simulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Market {

		    private Map<String, Stock> stocks;

		    public Market() {
		        stocks = new HashMap<>();
		        stocks.put("AAPL", new Stock("AAPL", 150.0));
		        stocks.put("GOOG", new Stock("GOOG", 2800.0));
		        stocks.put("TSLA", new Stock("TSLA", 700.0));
		        stocks.put("AMZN", new Stock("AMZN", 3400.0));
		    }

		    public void updateMarket() {
		        for (Stock stock : stocks.values()) {
		            stock.updatePrice();
		        }
		    }

		    public void displayMarket() {
		        System.out.println("\n--- Market Prices ---");
		        for (Stock stock : stocks.values()) {
		            System.out.println(stock);
		        }
		    }

		    public Stock getStock(String symbol) {
		        return stocks.get(symbol);
		    }

		    public Set<String> getSymbols() {
		        return stocks.keySet();
		    }
		}

		
		
		

