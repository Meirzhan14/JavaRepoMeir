package Vk.map;

import java.util.*;


public class MapLauncher {
    public static void main(String[] args) {

        Map<String, Integer> wordMap = new TreeMap<>();
        System.out.println("Please enter some text");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] tokens = string.split(" ");
        for(String token: tokens){
            String word = token.toLowerCase();
            Integer count = wordMap.get(word);
            if (count == null){
                wordMap.put(word,1);
            } else {
                wordMap.put(word,count+1);
            }
        }

        NavigableSet<WordWrapper> wordWrappers = convertToSet(wordMap);
        printSet(wordWrappers);


    }

    private static void printSet(NavigableSet<WordWrapper> wordWrappers) {

    }

    private static NavigableSet<WordWrapper> convertToSet(Map<String, Integer> wordMap) {
        NavigableSet<WordWrapper> wordSet = new TreeSet<>();
        for (Map.Entry<String, Integer> e : wordMap.entrySet()){
            wordSet.add(new WordWrapper(e.getKey(), e.getValue()));
        }
        return wordSet;
    }

////    private static void printMap(Map<String,Integer> wordMap) {
////        //Map<String,Integer> wordTreeMap = new TreeMap<>(wordMap);
////
////        Set<String> keys = wordMap.keySet();
////        for(String key: keys){
////            System.out.printf("%-10s%-10s \n", key, wordMap.get(key));
////        }
//    }
}
