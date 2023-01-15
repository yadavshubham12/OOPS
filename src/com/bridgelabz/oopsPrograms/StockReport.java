package com.bridgelabz.oopsPrograms;

import java.util.Scanner;

public class StockReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        for (int i = 0; i < numStocks; i++) {
            System.out.print("Enter the name of stock " + (i + 1) + ": ");
            String stockName = scanner.next();

            System.out.print("Enter the number of shares for stock " + (i + 1) + ": ");
            int numShares = scanner.nextInt();

            System.out.print("Enter the share price for stock " + (i + 1) + ": ");
            double sharePrice = scanner.nextDouble();

            Stock stock = new Stock(stockName, numShares, sharePrice);
            portfolio.addStock(stock);
        }
        portfolio.printStockReport();
    }
}
