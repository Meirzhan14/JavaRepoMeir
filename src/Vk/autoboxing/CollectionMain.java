package Vk.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(Integer.valueOf(1));

        Integer integer = 56;
        int n = integer.intValue();
        Double doub = 56.55;
        double d = doub.doubleValue();

        String[] colors = {"yellow", "red", "white"};

        LinkedList<String> li = new LinkedList<>(Arrays.asList(colors));
        li.add("black");

        colors = li.toArray(new String[li.size()]);

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }
}
