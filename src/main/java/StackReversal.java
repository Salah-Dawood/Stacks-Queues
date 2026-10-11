import java.util.Stack;

public class StackReversal {

    public static <E> void reverse(Stack<E> stack) {
        if (stack.isEmpty()) return;
        E top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    private static <E> void insertAtBottom(Stack<E> stack, E item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }

        E top = stack.pop();
        insertAtBottom(stack, item);
        stack.push(top);
    }
}
