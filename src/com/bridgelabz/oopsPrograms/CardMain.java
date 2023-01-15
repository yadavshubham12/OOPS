package com.bridgelabz.oopsPrograms;

public class CardMain {
    public static void main(String[] args) {
        Game game = new Game();

        Player player1 = new Player("Player 1");
        player1.addCard(new Card(3, "Hearts"));
        player1.addCard(new Card(8, "Clubs"));
        player1.addCard(new Card(10, "Diamonds"));
        player1.sortDeck();
        game.addPlayer(player1);

        Player player2 = new Player("Player 2");
        player2.addCard(new Card(2, "Spades"));
        player2.addCard(new Card(5, "Hearts"));
        player2.addCard(new Card(9, "Diamonds"));
        player2.sortDeck();
        game.addPlayer(player2);

        game.printPlayers();
    }
}
