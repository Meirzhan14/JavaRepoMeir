package Vk.collectionsClass;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsRunner {
    public static void main(String[] args) {

        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face: Card.Face.values()) {
            for (Card.Suit suit: Card.Suit.values()) {
                deckOfCards.add(new Card(suit,face));
            }
        }

        System.out.println("Original deck of cards");
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s ", deckOfCards.get(i),(i+1)%4 == 0 ? "\n" : " ");
        }
        Collections.shuffle(deckOfCards);

        System.out.println("\n\nCards after shuffle");
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s ", deckOfCards.get(i),(i+1)%4 == 0 ? "\n" : " ");
        }
    }

    public static class Card implements Comparable<Card>{


        private enum Suit{SPADES, HEARTS, CLUBS, DIMONS}

        private enum Face{ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NUNE, TEN, JACK, QUEEN, KING}

        private final Suit suit;
        private final Face face;

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }

        @Override
        public int compareTo(Card card) {

            Face[] values = Face.values();
            List<Face> faces = Arrays.asList(values);

            if(faces.indexOf(this.face)<faces.indexOf(card.getFace())){
                return -1;
            } else if (faces.indexOf(this.face)>faces.indexOf(card.getFace())){
                return +1;
            } else if (faces.indexOf(this.face)==faces.indexOf(card.getFace())){
                return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
            }
            return 0;
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }
    }
}
