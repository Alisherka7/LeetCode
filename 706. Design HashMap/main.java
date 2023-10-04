class MyHashMap {

    class Data{
        int key;
        int value;
        Data(){

        }

        Data(int k, int v){
            this.key = k;
            this.value = v;
        }
    }

    ArrayList<LinkedList<Data>> list;
    int size = 100;

    public MyHashMap() {
        list = new ArrayList<>(size);
        for(int i =0; i<size; i++){
            list.add(new LinkedList<Data>());
        }
    }

    public int hash(int key){
        return key % size;
    }

    public int search(int key){
        int i = hash(key);

        LinkedList<Data> temp = list.get(i);
        int ans = -1;
        for(int j =0; j<temp.size(); j++){
            if(key == temp.get(j).key){
                return j;
            }
        }
        return ans;
    }
    
    public void put(int key, int value) {
        int i = hash(key);
        if(search(key) != -1){
            remove(key);
        }
        list.get(i).add(new Data(key, value));
    }


    
    public int get(int key) {
        int i = hash(key);
        int pos = search(key);
        if(pos == -1){
            return -1;
        }
        return list.get(i).get(pos).value;
    }
    
    public void remove(int key) {
        int i = hash(key);
        if(search(key) == -1){
            return;
        }
        list.get(i).removeIf(t -> t.key == key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
