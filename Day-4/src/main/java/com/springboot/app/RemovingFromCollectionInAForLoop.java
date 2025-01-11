package com.springboot.app;

import java.util.ArrayList;
import java.util.List;

public class RemovingFromCollectionInAForLoop {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        for(Integer i: list) {
//            // there is an iterator behind the scenes for this for loop
//            if(i == 3) {
//                list.remove(i);
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 3) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
