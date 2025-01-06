package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak");
        list.add("dela?");
        list.add("Poka!");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));

        List<Integer> listResult = list.stream().map(element->element.length()).toList();

        System.out.println(listResult);

        int[] array = {1,3,9,2,12,24};

       array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element/3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));
    }
}
