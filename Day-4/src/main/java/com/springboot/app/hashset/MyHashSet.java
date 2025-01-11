package com.springboot.app;

public class MyHashSet<K> {
    Node<K>[] buckets;
    int capacity = 10;

    public MyHashSet() {
        buckets = new Node[capacity];
    }

    public MyHashSet(int capacity) {
        this.capacity = capacity;
        buckets = new Node[capacity];
    }

    private int calculateHash(int hashcode) {
        return hashcode % this.capacity;
    }

    // set's add method
    public void add(K key) {
        int index = calculateHash(key.hashCode());
        Node<K> head = buckets[index];
        boolean keyFound = false;
        while(head != null) {
            if(head.key.equals(key)) {
                keyFound = true;
            }
            head = head.next;
        }
        if(!keyFound) {
            Node<K> newNode = new Node<>(key, buckets[index]);
            buckets[index] = newNode;
        }
    }

    public boolean contains(K key) {
        int index = calculateHash(key.hashCode());
        Node<K> head = buckets[index];
        while(head != null) {
            if(head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean remove(K key) {
        int index = calculateHash(key.hashCode());
        Node<K> curr = buckets[index];
        Node<K> prev = null;
        while(curr != null) {
            if(curr.key.equals(key)) {
                if(prev != null) {
                    prev.next = curr.next;
                } else {
                    buckets[index] = curr.next;
                }
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    public void printSet() {
        for(int i = 0; i < capacity; i++) {
            Node<K> head = buckets[i];
            while(head != null) {
                System.out.print(head.key.toString());
                if(head.next != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        MyHashSet<String> test = new MyHashSet<>(7);
        test.add("one");
        test.add("two");
        test.add("three");
        test.add("four");
        test.add("five");
        test.add("six");
        test.add("seven");
        test.add("eight");
        test.printSet();
        System.out.println(test.contains("four"));
        test.remove("six");
        test.remove("five");
        test.remove("seven");
        test.printSet();
    }
}
