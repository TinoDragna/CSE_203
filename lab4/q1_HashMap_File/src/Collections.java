import java.io.*;
import java.util.*;

public class Collections {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Map <String,String> dictionary = new HashMap<>();
        try {
            File input = new File("inputDictionary.txt");
            Scanner scanner = new Scanner(input);
            while (scanner.hasNext()) {
                String line =  scanner.nextLine();
                String[] part = line.split(",");
                dictionary.put(part[0], part[1]);
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
                    
        for (Map.Entry<String,String> entry : dictionary.entrySet()) {
            System.out.println("word: "+ entry.getKey()+", meaning: "+ entry.getValue());
        }

        System.out.println("Nhap tu can tim: ");
        String find = sc.nextLine();
        System.out.println("word: " +find +", meaning: "+ dictionary.get(find));
    }
}
