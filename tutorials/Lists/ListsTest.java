package Lists;

import Documents.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListsTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kocjan");
        names.add("Zbyszek");
        names.add("Bogdan");
        names.add("Kocjan");

        System.out.println(names.get(1));
        System.out.println(names.indexOf("Kocjan"));
        System.out.println(names.lastIndexOf("Kocjan"));
        System.out.println(names.contains("Zbyszek"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());

        List<Integer> numbs = new LinkedList<>();
        numbs.add(1);
        numbs.add(3);
        numbs.add(5);
        numbs.add(7);

        System.out.println(numbs.get(1));
        System.out.println(numbs.indexOf(1));
        System.out.println(numbs.lastIndexOf(3));
        System.out.println(numbs.contains(7));
        System.out.println(numbs.size());
        System.out.println(numbs.isEmpty());

        List<String> ss = new ArrayList<>();
        ss.addAll(names);

        List<PdfDocument> pdf = new ArrayList<>();
        pdf.add(new PdfDocument());

        for(int i = 0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        for(String nam: names){
            System.out.println(nam);
        }
    }
}
