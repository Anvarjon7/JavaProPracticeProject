package de.telran.javaProPractice.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(10,"Germany");
        treeMap.put(2,"Spain");
        treeMap.put(4,"Italy");
        treeMap.put(6,"France");
        treeMap.put(8,"Poland");
        treeMap.put(0,"Austria");

        String item = treeMap.get(0);
        System.out.println(item);

        for (Map.Entry<Integer,String> items : treeMap.entrySet()){
            System.out.printf("Key -> %d Values -> %s \n", items.getKey(),items.getValue());
        }

        Set<Integer> set = treeMap.keySet();

        Collection<String> strings = treeMap.values();

        Map<Integer,String> stringMap = treeMap.tailMap(4,false);
        System.out.println(stringMap);

        Map<Integer,String> stringMap2 = treeMap.headMap(4,true);
        System.out.println(stringMap2);

        Map.Entry<Integer, String> stringMap3 = treeMap.lastEntry();
        System.out.printf("Last item has key %d value %s \n",stringMap3.getKey(), stringMap3.getValue());

        Map<String,Person> personMap = new TreeMap<>();
        personMap.put("001",new Person("Jack"));
        personMap.put("004",new Person("Deph"));
        personMap.put("006",new Person("Anna"));
        personMap.put("010",new Person("Lola"));

        for (Map.Entry<String,Person> items : personMap.entrySet()){
            System.out.printf("Key -> %s Person %s \n ", items.getKey(),items.getValue().getName());
        }
    }
}
