public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={11,34,56,76};
        int[] b={23,45,46,89};
        int m=a.length; int n= b.length;
        int[] c=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                i++;k++;
            }
        }
        for (int ele:c) {
            System.out.print(ele+" ");
            
        }
    }
}
