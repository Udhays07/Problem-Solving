class MyHashMap {
    // List of key-value pairs
    public ArrayList<ArrayList<Integer>> list;

    public MyHashMap() {
        list = new ArrayList<>();
    }

    // Put key-value pair into the map
    public void put(int key, int value) {
        // First, check if the key already exists, if so, update its value
        for (ArrayList<Integer> innerList : list) {
            if (innerList.get(0) == key) {
                innerList.set(1, value);
                return;
            }
        }
        // If key doesn't exist, add a new key-value pair
        list.add(new ArrayList<>(List.of(key, value)));
    }

    // Get the value associated with the key
    public int get(int key) {
        for (ArrayList<Integer> innerList : list) {
            if (innerList.get(0) == key) {
                return innerList.get(1); // Return the value
            }
        }
        return -1; // If key not found, return -1
    }

    // Remove the key-value pair from the map
    public void remove(int key) {
        int i = 0;
        for (ArrayList<Integer> innerList : list) {
            if (innerList.get(0) == key) {
                list.remove(i); // Remove the key-value pair
                return;
            }
            i++;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
