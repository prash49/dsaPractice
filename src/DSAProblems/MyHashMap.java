package DSAProblems;

class MyHashMap<K, V> {
    private Object[] table;
    private static final int SIZE = 16;

    public MyHashMap() {
        table = new Object[SIZE];
    }

    public void put(K key, V value) {
        int index = key.hashCode() % SIZE;
        table[index] = value;
    }

    public V get(K key) {
        int index = key.hashCode() % SIZE;
        return (V) table[index];
    }

    public void remove(K key) {
        int index = key.hashCode() % SIZE;
        table[index] = null;
    }
}
