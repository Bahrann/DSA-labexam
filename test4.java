

// 4
public class test4 {
    public static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int maxElement = arr[0];
        for (int num : arr) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findMaximum(arr));  // Output: 5
    }
}