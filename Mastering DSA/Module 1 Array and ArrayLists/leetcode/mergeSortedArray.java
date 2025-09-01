public class mergeSortedArray {//leetcode 88 easy
    public void merge(int[] a, int m, int[] b, int n) {
        int[] c = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (i == m) {
            while (j < n) {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (j == n) {
            while (i < m) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        for (int h = 0; h < c.length; h++) {
            a[h] = c[h];
        }
    }
}
