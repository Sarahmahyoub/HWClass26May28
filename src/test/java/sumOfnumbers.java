import java.util.ArrayList;
import java.util.List;

public class sumOfnumbers {

    public static void main(String[] args) {
//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers

        List<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(25);
        nums.add(44);
        nums.add(65);
        nums.add(72);

        int sum=0;
        for (int i = 0; i < nums.size(); i++) {

            int n=nums.get(i);
            sum+=n;

        }
        System.out.println("Sum of all integers "+sum);

    }
}
