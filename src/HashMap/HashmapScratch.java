package HashMap;

import java.util.LinkedList;
import java.util.Objects;

public class HashmapScratch<K, V> {

    class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return  key + " : " + value;
        }
    }
    private LinkedList<Node>[] hashTable;
    private int element;
    private int tableSize;
    private double theresHold;

    private void initializeHashtable() {
        for (int i = 0; i < tableSize; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }
    HashmapScratch() {
        element = 0;
        tableSize = 16;
        theresHold = 0.75;
        hashTable = new LinkedList[tableSize];
        initializeHashtable();
    }
    private int getHashcode(K key){
        int hashCode = Objects.hash(key);
        return (Math.abs(hashCode)) % tableSize;
    }
    private int searchKeyInList(K key , int hashcode){
        LinkedList<Node> list = hashTable[hashcode];
        for(int index = 0; index < list.size(); index++){
            if(list.get(index).key.equals(key)){
                return index;
            }
        }
        return -1;
    }

    private void reHash(){
        LinkedList<Node>[] oldHashTable = hashTable;
        tableSize *=2;
        element =0;
        hashTable = new LinkedList[tableSize];
        initializeHashtable();
        for(LinkedList<Node> list : oldHashTable){
            for(Node node : list){
                put(node.key, node.value);
            }
        }

    }

    public void put(K key, V value) {
        int hashCode =getHashcode(key);
        int index = searchKeyInList(key,hashCode);
        Node node = new Node(key, value);
        if (index == -1) {
            hashTable[hashCode].add(0,node);
            element++;
        }else{
             hashTable[hashCode].get(index).value = value;
        }
        if(element/(double)tableSize > theresHold){
            reHash();
        }
    }

    public V get(K key) {
        int hashCode =getHashcode(key);
        int index = searchKeyInList(key,hashCode);
        if (index == -1) {
           return null;
        }else{
            return hashTable[hashCode].get(index).value;
        }
    }

    public boolean containsKey(K key){
        int hashCode =getHashcode(key);
        int index = searchKeyInList(key,hashCode);
        if (index == -1) {
            return false;
        }else{
            return true;
        }
    }

    public boolean containValue(V value){
        for(int i = 0; i < tableSize; i++){
            for(Node node : hashTable[i]){
                if(node.value.equals(value)){
                    return true;
                }
            }
        }
        return false;
    }


    public V remove(K key) {
        int hashCode =getHashcode(key);
        int index = searchKeyInList(key,hashCode);

        if (index == -1) {
            return null;
        }else{
           V value =  hashTable[hashCode].get(index).value ;
           hashTable[hashCode].remove(index);
           element--;
           return value;
        }
    }
    public void iterate(){
        for(int i = 0; i < tableSize; i++){
            for(Node node : hashTable[i]){
                System.out.println(node);
            }
        }
    }

    public boolean isEmpty(){
        return (element==0);
    }

    public int size (){
        return element;
    }
}
