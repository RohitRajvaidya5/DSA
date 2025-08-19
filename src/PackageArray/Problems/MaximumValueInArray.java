package PackageArray.Problems;

public class MaximumValueInArray {

    public static void main(String[] args) {
        int  [] arr = {1,2,1,111,2213123,43243425,56567457};
        System.out.println(maximumValue(arr));
    }

    public static String maximumValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return "Maximum value : " + max;
    }
}
