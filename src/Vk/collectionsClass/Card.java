package Vk.collectionsClass;

import java.util.Arrays;
import java.util.List;

public class Card implements Comparable<Card>{


    public enum Suit{SPADES, HEARTS, CLUBS, DIMONDS}

    public enum Face{ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

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
