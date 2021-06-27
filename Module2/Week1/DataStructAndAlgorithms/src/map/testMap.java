package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class testMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Smith", 30);
        hashmap.put("Anderson",31);
        hashmap.put("Lewis",29);
        hashmap.put("Cook",29);
        System.out.println("Display entries in Hashmap");
        System.out.println(hashmap + "\n");

        Map<String, Integer> treemap = new TreeMap<>();
        treemap.put("Smith", 30);
        treemap.put("Anderson",31);
        treemap.put("Lewis",29);
        treemap.put("Cook",29);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treemap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
