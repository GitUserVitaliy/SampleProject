package lesson9.Test;

import java.util.LinkedList;
import java.util.List;

public class Test {
    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            if(max < h[(int)word.charAt(i) -  97]) {
                max = h[(int)word.charAt(i) -  97];
            }
        }
        return max*word.length();
    }
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
//
        k = k % a.length;
        for (int i = 0; i < k; i++) {
            int last = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j-1];
            }
            a[0] = last;
        }
        int arr[] = new int [queries.length];
        for (int i = 0; i < queries.length; i++) {
            arr[i] = a[queries[i]];
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
