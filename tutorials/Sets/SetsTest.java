package Sets;

import java.util.HashSet;
import java.util.Set;

public class SetsTest {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Peer");
        fruits.add("Pomelo");
        fruits.add("Watermelon");
        fruits.add("Peer");
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("Onion");
        vege.add("Carrot");
        vege.add("Tomato");
        vege.add("Potato");
        vege.add("Cucumber");
        vege.addAll(fruits);

        System.out.println(vege.size());
        System.out.println(vege.contains("Apple"));
        for(String nms: vege){
            System.out.println(nms);
        }

        }
}
