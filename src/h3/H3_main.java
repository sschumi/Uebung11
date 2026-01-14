package h3;
import java.util.Arrays;

public class H3_main {
    public static void main(String[] args){
        int[] b = {9,4,2,7,4};
        System.out.println(Arrays.toString(mergeSort(b)));
    }

    public static int[] mergeSort(int[] a){
        if(a.length <= 1){
            return a;
        } else {
            int[] l = mergeSort(Arrays.copyOfRange(a, 0, a.length/2));
            int[] r = mergeSort(Arrays.copyOfRange(a, a.length/2, a.length));
            return merge(l, r);
        }
    }

    private static int[] merge(int[] l, int[] r){
        int[] result = new int[l.length+r.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < l.length && j < r.length){
            if(l[i] <= r[j]){
                result[k++] = l[i++];
            } else {
                result[k++] = r[j++];
            }
        }

        while(i < l.length){
            result[k++] = l[i++];
        }

        while(j < r.length){
            result[k++] = r[j++];
        }

        return result;
    }
}
