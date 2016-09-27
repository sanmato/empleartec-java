
package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordCounter {
    private Map <String, Integer> map;
    private Scanner scanner;

    public WordCounter() {
    map = new HashMap<String, Integer>();
    scanner = new Scanner (System.in);
    createMap();
    showMap();
    }

    private void createMap() {
    System.out.println("Write a Phrase!: ");
    String entry = scanner.nextLine();
    
    StringTokenizer tokenizer = new StringTokenizer(entry);
    
    
    while(tokenizer.hasMoreTokens()){
        String word=tokenizer.nextToken().toLowerCase();
        
        if(map.containsKey(word)){
            int count = map.get(word);
            map.put(word, count+1);
        }
        else{
            map.put(word, 1);
        }
    }
  
    }

    private void showMap() {
    Set <String> keys = map.keySet();
    
    TreeSet <String> organizedkeys = new TreeSet <String> (keys);
    
        System.out.println("The map contains: \nKey\t\tValue");
        
        for(String key : organizedkeys)
            System.out.println(key+"\t\t"+map.get(key));
        
        System.out.println("--------------------------");
        
        System.out.println("Size: "+map.size());
        
        System.out.println("--------------------------");
        
        System.out.println("Is Empty?: "+map.isEmpty()+"!");
        
        System.out.println("--------------------------");
    }
    
    
}
