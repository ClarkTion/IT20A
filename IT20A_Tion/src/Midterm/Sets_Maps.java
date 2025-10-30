
package Midterm;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class Sets_Maps {
    public static void main(String[] args) {
        List <String> names = new LinkedList<>();
        
        names.add("Clark");
        names.add("Elizha");
        names.add("Chalce");
        names.add("Kim");
        names.add("Kent");
        names.add("Joberth");
        names.add("Zustin");
        names.add("Vince");
        names.add("Jenny");
        names.add("Kevin");
        names.add("Clark");
        names.add("Elizha");
        names.add("Joberth");
        names.add("Jacob");
        
        System.out.println("Original List (Unorganized with Duplicates):");
        System.out.println(names);
        
        System.out.println("\n");
        
        
        Set <String> noDuplicates = new HashSet<>(names);
        System.out.println("Unique Student Names (Using HashSet):");
        System.out.println(noDuplicates);
        
        System.out.println("\n");
        
        Set <String> orderednames = new TreeSet<>(noDuplicates);
        
        System.out.println("Sorted and Unique Student Names (Using TreeSet):");
        System.out.println(orderednames);
        
        
        
    }
}
