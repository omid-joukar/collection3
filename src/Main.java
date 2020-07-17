import java.util.ArrayList;
import java.util.List;

/**
 * Created by KPS on 7/17/2020.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
         
        // Print the list
        System.out.println(list_Strings);
        list_Strings.add(0,"Pink");
        list_Strings.add(5,"Yellow");
        for (String st : list_Strings){
            System.out.print("\t"+st);
        }
    }
}
