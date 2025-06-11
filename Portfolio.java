package simulator;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
	
		    private Map<String, Integer> holdings;
		    private double balance;

		    public Portfolio(double startingBalance) {
		        this.balance = startingBalance;
		        this.holdings = new HashMap<>();
		    }

		    public void buyStock(Stock stock, int quantity) {
		        double cost = stock.getPrice() * quantity;
		        if (cost > balance) {
		            System.out.println("Insufficient balance.");
		            return;
		        }

		        balance -= cost;
		        holdings.put(stock.getSymbol(), holdings.getOrDefault(stock.getSymbol(), 0) + quantity);
		        System.out.println("Bought " + quantity + " shares of " + stock.getSymbol());
		    }

		    public void sellStock(Stock stock, int quantity) {
		        String symbol = stock.getSymbol();
		        int owned = holdings.getOrDefault(symbol, 0);
		        if (owned < quantity) {
		            System.out.println("Not enough shares to sell.");
		            return;
		        }

		        balance += stock.getPrice() * quantity;
		        holdings.put(symbol, owned - quantity);
		        System.out.println("Sold " + quantity + " shares of " + symbol);
		    }

		    public void viewPortfolio(Market market) {
		        System.out.println("\n--- Portfolio ---");
		        for (String symbol : holdings.keySet()) {
		            int qty = holdings.get(symbol);
		            Stock stock = market.getStock(symbol);
		            System.out.printf("%s - %d shares @ $%.2f = $%.2f\n", symbol, qty, stock.getPrice(), qty * stock.getPrice());
		        }
		        System.out.printf("Cash Balance: $%.2f\n", balance);
		    }
		}

		
		
	
