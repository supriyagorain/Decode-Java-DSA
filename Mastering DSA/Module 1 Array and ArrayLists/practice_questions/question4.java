
import java.util.ArrayList;
import java.util.Scanner;

public class question4 {
    
    // Method to find the first occurrence of target integer in ArrayList
    public static int findFirstOccurrence(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i; // Return index of first occurrence
            }
        }
        return -1; // Return -1 if target not found
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
         // Input: size of ArrayList
        int size = sc.nextInt();
        
        // Input: elements of ArrayList
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        
        // Input: target integer to search
        int target = sc.nextInt();
        
        // Find and print the result
        int result = findFirstOccurrence(list, target);
        System.out.println(result);
        
        sc.close();
    }
}