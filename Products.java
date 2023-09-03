import java.util.HashMap;
import java.util.Map;

public class Products {

    public static void main(String[] args){
        Map<String, Integer> items = new HashMap<>();
//        put() to add an element
        items.put("Monitors", 9000);
        items.put("Mouse", 1050);
        items.put("Keyboard", 1499);
        items.put("SSD", 5000);
        items.put("HDD", 3500);
        items.put("Power Supply", 4500);

//        Collection of Keys (Set<String>)- They ar unique
//        Collection of Values (Collection<Integer>)
        for (String key : items.keySet()){
//            get() to retrieve
            Integer value = items.get(key);
//            %s: %d.%n is a placeHolder
            System.out.printf("%s: %d.%n", key, value);
        }
//         Collection of entry -> key +value (Set) *** all should be unique

 //        class
//        abstract class -> it can contain abstract methods
//        interface -> all the methods are abstract
        for (Map.Entry<String, Integer> item : items.entrySet()){
            if (item.getValue() > 3000){
//                if (item.getKey().contains("s")){
                    System.out.printf("The price of item of %s: %d.%n", item.getKey(), item.getValue());
//                }
            }
        }
        System.out.println("==================================");

    }
}
