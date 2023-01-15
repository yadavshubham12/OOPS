package com.bridgelabz.oopsPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
        private String name;
        private int numShares;
        private double sharePrice;

        public Stock(String name, int numShares, double sharePrice) {
            this.name = name;
            this.numShares = numShares;
            this.sharePrice = sharePrice;
        }

        public String getName() {
            return name;
        }

        public int getNumShares() {
            return numShares;
        }

        public double getSharePrice() {
            return sharePrice;
        }

        public double getValue() {
            return numShares * sharePrice;
        }
    }

    class StockPortfolio {
        private ArrayList<Stock> stocks;

        public StockPortfolio() {
            stocks = new ArrayList<>();
        }

        public void addStock(Stock stock) {
            stocks.add(stock);
        }

        public double getTotalValue() {
            double totalValue = 0;
            for (Stock stock : stocks) {
                totalValue += stock.getValue();
            }
            return totalValue;
        }

        public void printStockReport() {
            for (Stock stock : stocks) {
                System.out.println("Stock: " + stock.getName());
                System.out.println("Number of shares: " + stock.getNumShares());
                System.out.println("Share price: " + stock.getSharePrice());
                System.out.println("Total value: " + stock.getValue());
                System.out.println();
            }
            System.out.println("Total value of all stocks: " + getTotalValue());
        }
    }

