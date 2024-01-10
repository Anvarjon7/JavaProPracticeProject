package de.telran.javaProPractice.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Germany");
        map.put(2,"France");
        map.put(3,"Spain");
        map.put(4,"Italy");

        String str = map.get(3);
        System.out.println(str);

        Set<Integer> keys = map.keySet();

        Collection<String> values = map.values();

        map.replace(1,"Poland");
        map.remove(2);

        for(Map.Entry<Integer,String> item : map.entrySet()){
            System.out.printf("Key: %d Value: %s \n",item.getKey(),item.getValue());
        }
        Map<String,Person> personMap = new HashMap<>();
        personMap.put("1240i54", new Person("Tom"));
        personMap.put("1240i55", new Person("Bill"));
        personMap.put("1240i56", new Person("Nick"));

        for (Map.Entry<String,Person> value : personMap.entrySet()){
            System.out.printf("Key: %s Value: %s \n",value.getKey(),value.getValue().getName());
        }
    }
}
