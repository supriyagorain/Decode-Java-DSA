public class sumofArray {
    public static void main(String[] args) {
        int[] arr={13,25,36,43,54,57,84};
        int l=arr.length;
        int sum=0;
        for (int i = 0; i <l; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

