package holding;

import java.util.*;

/**
 * Created by dw on 2017-3-13.
 */
/*
* 第一个fill()方法可以作用于所有类型的Collection
* ArrayList,LinkedList都是List类型，按照插入顺序保存元素，LinkedList包含操作多余ArrayList
* HashSet,TreeSet,LinkedHashSet为set类型，输出显示在set，每个相同项只保存一次，输出也显示不了不同的set实现存储元素方式
* HashSet使用的是相当复杂的方式存储；TreeSet按照比较结果升序保存；LinkedHashSet按照添加顺序保存
* Map为关联数组，用键查找对象，对于每一个键，Map只存储一次。Map.put<key,value>方法增加一个值；Map<key>方法产生与这键相关联的值
* 键和值在Map中保存顺序不是插入顺序，HashMap实现使用的是一种非常快的算法来控制顺序。
* HashMap,TreeMap比较结果升序保存,LinkedHashMap插入顺序保存
* */
public class PrintingContainer {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String,String>map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","dog1");
        map.put("dog","dog2");
        return map;
    }
    public static void main(String[]args){
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
    }
}
