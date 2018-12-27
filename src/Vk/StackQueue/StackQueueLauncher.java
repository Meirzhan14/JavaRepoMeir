package Vk.StackQueue;

import Vk.collectionsClass.Card;
import Vk.collectionsClass.CardComparator;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueueLauncher {

    public static void main(String[] args) {
       //     passengerProcessing();

        Queue<Card> cardsDeck = new PriorityQueue<>(52, new CardComparator());
        for (Card.Face face: Card.Face.values()) {
            for (Card.Suit suit: Card.Suit.values()) {
                cardsDeck.offer(new Card(suit,face));
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(cardsDeck.poll());
        }
        System.out.println("Deck Size is "+ cardsDeck.size());
        System.out.println(cardsDeck.peek());
        System.out.println(cardsDeck.peek());

    }

    private static void passengerProcessing(){
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Meir", "Askerbekov");
        bus.push(new Passenger("Alex", "Hunter"));
        bus.push(new Passenger("Alex1", "Hunter1"));
        bus.push(new Passenger("Alex2", "Hunter2"));
        bus.push(new Passenger("Alex3", "Hunter3"));
        bus.push(passenger);

        System.out.println("Passenger found at position " + bus.search(passenger));

        System.out.println("Last entered passenger is "+ bus.peek());
        while(!bus.empty()){
            System.out.println("Passengers:" + bus.pop());
        }
        //System.out.println(bus.pop());
    }

    private static class Passenger {
        private static int number =1;
        private String name;
        private String surname;

        public Passenger(String name, String surname) {
            number++;
            this.name = name;
            this.surname = surname;
        }

        public static int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger " +
                    "name=' " + name + '\'' +
                    ", surname='" + surname + '\'' ;
        }
    }
}
