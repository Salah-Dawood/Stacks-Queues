public class BracketBalancerDemo {
    public static void main(String[] args) {
        String[] tests = {
                "{[()]}",
                "a * (b + c) - [d / e]",
                "",
                "no brackets",
                "(]",
                "([)]",
                "((",
                "))",
                "{[(])}",
                "{[}"
        };
        for (String test : tests) {
            System.out.printf("%-25s -> %s%n", "\"" + test + "\"",
                    BracketBalancer.isBalanced(test) ? "balanced" : "NOT balanced");
        }
    }
}
