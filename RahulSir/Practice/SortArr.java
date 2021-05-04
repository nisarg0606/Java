package RahulSir.Practice;
import java.util.ArrayList;
import java.util.Collections;
public class SortArr {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println("Before Sorting: ");
        for (String str : list)
            System.out.println(str);
        System.out.println("After Sorting: ");
        Collections.sort(list);
        for (String str : list)
            System.out.println(str);
    }
}
