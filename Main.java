package simulator;

import java.util.Scanner;

public class Main {

			    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Market market = new Market();
		        Portfolio portfolio = new Portfolio(10000.0); // Starting with $10,000

		        while (true) {
		            market.updateMarket();
		            market.displayMarket();
		            portfolio.viewPortfolio(market);

		            System.out.println("\nChoose an option:");
		            System.out.println("1. Buy Stock");
		            System.out.println("2. Sell Stock");
		            System.out.println("3. Exit");
		            System.out.print("Enter choice: ");
		            int choice = scanner.nextInt();

		            if (choice == 3) {
		                System.out.println("Exiting simulator. Goodbye!");
		                break;
		            }

		            System.out.print("Enter stock symbol: ");
		            String symbol = scanner.next().toUpperCase();
		            Stock stock = market.getStock(symbol);

		            if (stock == null) {
		                System.out.println("Invalid stock symbol.");
		                continue;
		            }

		            System.out.print("Enter quantity: ");
		            int qty = scanner.nextInt();

		            if (choice == 1) {
		                portfolio.buyStock(stock, qty);
		            } else if (choice == 2) {
		                portfolio.sellStock(stock, qty);
		            } else {
		                System.out.println("Invalid choice.");
		            }
		        }

		        scanner.close();
		    }
		}

		
		
		
	
