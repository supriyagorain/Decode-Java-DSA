
import java.util.ArrayList;

public class basicofArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(3);
        arr.add(0,10);//initialize
        arr.add(1, 20);//if we exclude any of the elements then index out of bound exception,unlike arrays
        arr.add(2, 30);
        System.out.println(arr.get(0));
        System.out.println(arr);
        for (int i=0; i<=2; i++) {
            System.out.println(arr.get(i));            
        }
        arr.set(1, 50);//update
        for (int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));            
        }
        arr.add(90);//push back
        for (int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));            
        }
    }
    
}
