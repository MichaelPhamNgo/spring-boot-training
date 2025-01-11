package com.springboot.app;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        int[] array = new int[5];
//        int[] array1 = new int[]{1, 2, 3};
//        Integer[] array2 = {1, 2, 3, 4};
////        System.out.println(Arrays.toString(array2));
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
////        System.out.println(list);
//
//        Set<Integer> set = new HashSet<>(list);
//        System.out.println(set);
//
//        List<String> list1 = Arrays.asList("Hello", "World");
//        List<Integer> list2 = Arrays.asList(array2);
//        System.out.println(list2);
//        List<Integer> list3 = new ArrayList<>(list2);
//        list3.add(4);
//        System.out.println(list3);
//
//        Integer[] array45 = list3.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(array45));
//
//        Queue<Integer> q1 = new LinkedList<>();
//        q1.add(2);
//        q1.add(1);
//        q1.add(3);
//
//        Queue<Integer> q2 = new PriorityQueue<>(Comparator.reverseOrder());
//        q2.offer(2);
//        q2.offer(1);
//        q2.offer(3);
//
//        System.out.println(q1.peek());
//        System.out.println(q2.peek());

//        Map<String, Integer> map = new LinkedHashMap<>();
//        map.put("Three", 3);
//        map.put("Two", 2);
//        map.put("One", 1);
//        if(map.containsKey("Three")) {
//            map.remove("Three");
//            map.put("Three", 4);
//        }
//        System.out.println(map.get("Three"));
//        for(Map.Entry<String, Integer> s: map.entrySet()) {
//            System.out.println("key is :" + s.getKey());
//            System.out.println("Kye is :" + s.getValue());
//        }

//        String string = "aabbcccdddd";
//        Map<Character, Integer> charCount = new HashMap<>();
//        for(char c: string.toCharArray()) {
//            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//        }
//        System.out.println(charCount);

        // Hashset internallly contains a Hashmap
        // values are dummy values
        // hashset.add() -> hashmap.put(key, dummy value)

        User u1 = new User(100, "Jack");
        User u2 = new User(200, "Alice");
        User u3 = new User(300, "Tommy");
        List<User> users = Arrays.asList(u3, u2, u1);
        System.out.println(users);
        Collections.sort(users);
//        System.out.println(users);
//        Collections.sort(users, new User.UserComparator());
//        users.sort(new User.UserComparator());
        users.sort((a, b)-> a.getName().compareTo(b.getName()));
        System.out.println(users);

//        String s1 = "alice";
//        String s2 = "Bob";
//        System.out.println(s1.compareTo(s2));
    }
}
