package com.springboot.app;

import java.util.*;

public class Example {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        Integer[] array = list.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(array));

        GenericExample<Integer> genericExample = new GenericExample<>(1);
        Integer s = genericExample.getT();
        System.out.println(s);

//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        int[] ints = new int[10];
//        int[] ints1 = new int[]{1, 2, 3, 4, 5, 6};
//        Integer[] ints2 = {1, 2, 3, 4, 5, 6};
//        List<String> strings = new ArrayList<>();
//        Set<String> setOfStrings = new HashSet<>(strings);
//        List<Integer> listFromArray = Arrays.asList(ints2);
//
//        List<Integer> listFromList = new ArrayList<>(listFromArray);
//
//        listFromList.add(7);
//        System.out.println(listFromList);

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.offer(7);
//        pq.offer(0);
//        pq.offer(9);
//        while(!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }

//        Map<String, String> map = new HashMap<>();
//        System.out.println(map.get("Jack"));
//        System.out.println(map.getOrDefault("Jack", "Key-value pair does not exist within the map"));
//        Map<Character, Integer> characterFrequency = new HashMap<>();
//        String input = "inputstring";
//        for(Character c: input.toCharArray()) {
//            characterFrequency.put(c, characterFrequency.getOrDefault(c, 0) + 1);

//        HashSet internlly contains a HashMap
//        And for the add method of the HashSet
//                What it is actually is doing is that is it's calling the put method of the internal HashMap
//                hashset.Add(T object) -> hashMap.put(object, PRESENT);
//        }
    }
}
