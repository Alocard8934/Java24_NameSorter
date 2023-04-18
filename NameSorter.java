package JAVA24;
import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        String names[] = {
        "Ivan", "Semen", "Dmitry", "Natalya", "Olga", "Valentina",
            "Tatjana", "Andrej", "Boris"
        };
        
        System.out.println("Before sorting: ");
        for(int i = 0; i < names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
        Arrays.sort(names);
        System.out.println("After sorting: ");
        for(int i = 0; i < names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
    }
}
