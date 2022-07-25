package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> std = new HashMap<>();
        std.put(1,"Janusz");
        std.put(2,"Halyna");
        std.put(3,"Pjoter");
        std.put(4,"Janusz");
        std.put(3,"Brajan");

        System.out.println(std.get(3));

        Map<Integer,String> other = new HashMap<>();
        other.putAll(std);

        System.out.println(other.containsKey(1));
        System.out.println(other.containsValue("dyzio"));
        System.out.println(other.isEmpty());
        System.out.println(other.size());
        other.remove(2);
        System.out.println(other.size());
        for(Integer ks :other.keySet()){
            System.out.println(ks);
            System.out.println(other.get(ks));
        }
    }
}
