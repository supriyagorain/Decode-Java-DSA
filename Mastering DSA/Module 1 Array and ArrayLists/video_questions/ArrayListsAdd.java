import java.util.ArrayList;

public class ArrayListsAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list+ " "+list.size());
        list.add(10);
        System.out.println(list+ " "+list.size());
        list.add(20);
        System.out.println(list+ " "+list.size());
        list.remove(0);
        System.out.println(list+ " "+list.size());
    }
}
