package Vk.collectionsClass;

import java.util.*;

public class CollectionsRunner {
    public static void main(String[] args) {

        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face: Card.Face.values()) {
            for (Card.Suit suit: Card.Suit.values()) {
                deckOfCards.add(new Card(suit,face));
            }
        }

        //System.out.println("Original deck of cards");
        printOutput(deckOfCards);
        Collections.shuffle(deckOfCards);

        Collections.sort(deckOfCards);
        Card card = new Card(Card.Suit.SPADES, Card.Face.ACE);
        int i = Collections.binarySearch(deckOfCards, card);
        if(i >= 0){
            System.out.println("Card was found at position "+i);
        } else {
            System.out.println("Card was not found");
        }

        System.out.println("\n\nCards after shuffle");
        //printOutput(deckOfCards);
        List<Card> cardList = new ArrayList<>(deckOfCards);
        Collections.fill(cardList,card);
        printOutput(cardList);
    }


    private static void printOutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s ", deckOfCards.get(i),(i+1)%4 == 0 ? "\n" : " ");
        }
    }

}
