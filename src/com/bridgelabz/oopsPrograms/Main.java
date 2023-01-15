//package com.bridgelabz.oopsPrograms;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws FileNotFoundException {
//        StockPortfolio portfolio = new StockPortfolio();
//        File inputFile = new File("input");
//        Scanner inputScanner = new Scanner(inputFile);
//        while (inputScanner.hasNextLine()){
//            String name = inputScanner.nextLine();
//            int shares = inputScanner.nextInt();
//            double price = inputScanner.nextDouble();
//            Stock stock = new Stock(name, shares, price);
//            portfolio.addStocks(stock);
//            break;
//        }
//        inputScanner.close();
//        for (Stock stock : portfolio.stocks){
//            System.out.println("Stock name : " +stock.name);
//            System.out.println("Number of shares : " +stock.shares);
//            System.out.println("Share Price : " +stock.price);
//            System.out.println("Stock Value : " +stock.Value());
//            System.out.println(" ");
//        }
//        System.out.println("Total value of portfolio : " + portfolio.value());
//    }
//}
