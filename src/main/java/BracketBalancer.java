public class BracketBalancer {

    public static boolean isBalanced(String exp) {
        if (exp == null) return true;
        SingleArrayStack stack = new SingleArrayStack(exp.length() + 1);
        for (char c : exp.toCharArray()) {
            switch (c) {
                case '(', '[', '{' -> stack.push(c);
                case ')', ']', '}' -> {
                    if (stack.isEmpty() || !matches(stack.pop(), c)) return false;
                }
                default -> {}
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }
}
