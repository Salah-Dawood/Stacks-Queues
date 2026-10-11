public class ArrayRotation {

    public static void rotate(int[] arr, int d, int n) {
        if (arr == null || n <= 1 || n > arr.length) return;
        d = ((d % n) + n) % n;//handling d> n
        if (d == 0) return;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }
    }
}
