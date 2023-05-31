import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Fruits {

    //3) Create the collection that will store single uniques Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.

    public static void main(String[] args) {

        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Strawberry");

        String concat = String.join(" ",fruits);

        System.out.println(concat);

    }
}
