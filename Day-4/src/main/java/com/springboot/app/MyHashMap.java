public class MyHashMap<K, V> {
    Node<K, V>[] buckets;
    int capacity = 10;

    public MyHashMap() {
        buckets = new Node[capacity];
    }

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        buckets = new Node[capacity];
    }

    private int calculateHash(int hashcode) {
        return hashcode % this.capacity;
    }

    public void put(K key, V value) {
        int index = calculateHash(key.hashCode());
        Node<K, V> head = buckets[index];
        boolean keyFound = false;
        while(head != null) {
            if(head.key.equals(key)) {
                head.value = value;
                keyFound = true;
            }
            head = head.next;
        }
        if(!keyFound) {
            Node<K, V> newNode = new Node<>(key, value, buckets[index]);
            buckets[index] = newNode;
        }
    }

    public V get(K key) {
        int index = calculateHash(key.hashCode());
        Node<K, V> head = buckets[index];
        while(head != null) {
            if(head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void printMap() {
        for(int i = 0; i < capacity; i++) {
            Node<K, V> head = buckets[i];
            while(head != null) {
                System.out.print(head.key.toString() + ":" + head.value.toString());
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
        MyHashMap<String, Integer> test = new MyHashMap<>(7);
        test.put("one", 1);
        test.put("two", 2);
        test.put("three", 3);
        test.put("four", 4);
        test.put("five", 5);
        test.put("six", 6);
        test.put("seven", 7);
        test.put("eight", 8);
        test.printMap();
        System.out.println(test.get("four"));
    }
}
