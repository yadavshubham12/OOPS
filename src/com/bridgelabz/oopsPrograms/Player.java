package com.bridgelabz.oopsPrograms;

import java.util.LinkedList;

public class Player {
    private String name;
    private LinkedList<Card>deck;

    public Player(String name) {
        this.name = name;
        this.deck = new LinkedList<Card>();
    }
    public void addCard(Card card){
        deck.add(card);
    }
    public void sortDeck() {
        deck.sort((c1, c2) -> c1.getRank() - c2.getRank());
    }
  public void removeCard(){
        deck.remove();
    }
    public String getName(){
        return name;
    }
    public LinkedList<Card> getDeck(){
        return deck;
    }
    public String toString(){
        return name + ": " +deck.toString();
    }
}
class Game {
    private LinkedList<Player> players;

    public Game() {
        players = new LinkedList<Player>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer() {
        players.remove();
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
}