import java.util.Stack;

public class StackReversalDemo {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();

        nums.push(1);nums.push(2);nums.push(3);nums.push(4);nums.push(5);

        System.out.println("Before reversing: " + nums);
        StackReversal.reverse(nums);
        System.out.println("after reversing:  " + nums);

        Stack<String> words = new Stack<>();

        words.push("a"); words.push("b"); words.push("c");
        System.out.println("before reversing: " + words);
        StackReversal.reverse(words);
        System.out.println("after reversing:  " + words);

        Stack<Integer> empty = new Stack<>();
        StackReversal.reverse(empty);
        System.out.println("Empty:  " + empty);

        Stack<Integer> one = new Stack<>();
        one.push(9);
        StackReversal.reverse(one);
        System.out.println("Single: " + one);
    }
}
