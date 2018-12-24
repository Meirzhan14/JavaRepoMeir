package Vk.autoboxing;

import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        list.add(1);

        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(1);
        }
    }
}
