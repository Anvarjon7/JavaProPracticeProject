package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private Map<String,FlyWeight> pool = null;

    public FlyWeightFactory() {
        this.pool = new HashMap<String,FlyWeight>();
        pool.put("11",new ConcreteFlyWeight());
        pool.put("12",new ConcreteFlyWeight());
    }

    public FlyWeight getFlyweight(String key){
        if (!this.pool.containsKey(key)){
            this.pool.put(key,new ConcreteFlyWeight());
        }
        return this.pool.get(key);
    }
}
