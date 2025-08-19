package PackageArray.Problems;

import java.util.Arrays;

public class SwappingNumbers {

    public static void main(String[] args) {
        int [] arr = {10, 20, 30 , 40, 50};
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
