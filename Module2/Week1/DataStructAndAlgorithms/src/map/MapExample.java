package map;

import java.util.*;
    class MapExample {
        public static void main(String args[]) {
//            Map<String, Integer> hm
//                    = new HashMap<String, Integer>();
//
//            hm.put("a", 100);
//            hm.put("b", 200);
//            hm.put("c", 300);
//            hm.put("d", 400);
//
//            // Traversing through the map
//            for (Map.Entry<String, Integer> map : hm.entrySet()) {
//                System.out.print(map.getKey() + ":");
//                System.out.println(map.getValue());
//            }
//        }
            Map<Integer, Integer> map1 = new HashMap<>();
//            System.out.println(map1.entrySet());
            map1.put(5, 10);
            map1.put(3, 30);
            map1.put(1, 20);
            map1.put(8,50);
            map1.put(4,25);
//            Set <String> keys = map1.keySet();
//            for(String key: keys){
//                System.out.printf("%s: %d\n",key,map1.get(key));
//            }
            System.out.printf("Before Sort:\n");
            for (Map.Entry<Integer, Integer> e : map1.entrySet()){
                System.out.println(e.getKey() + " "
                        + e.getValue());
            }
            System.out.println();
            Map<Integer, Integer> map = new TreeMap<>(map1);
            System.out.print("After Sort:\n");

            // iterate acc to ascending order of keys
//            map1.sort(Collections.reverseOrder());
            for (Integer sKey : map.keySet()) {
                System.out.printf("%s:%d\n",sKey,(map1.get(sKey)));}

//            Collections.sort();
    }
    }



