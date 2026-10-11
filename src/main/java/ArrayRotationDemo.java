import java.util.Arrays;

public class ArrayRotationDemo {
    public static void main(String[] args) {
        int[][] tests = {
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5},
                {1, 2},
                {42,22},
                {}
        };
        int[] ds = {2, 7, 0, -1};
        for (int[] base : tests) {
            for (int d : ds) {
                int[] arr = base.clone();
                ArrayRotation.rotate(arr, d, arr.length);
                System.out.printf("%s rotate by %2d -> %s%n", Arrays.toString(base), d, Arrays.toString(arr));
            }
        }
    }
}
