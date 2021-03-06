import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char cStack = stack.pop();
                boolean b1 = c == ')' && cStack != '(';
                boolean b2 = c == '}' && cStack != '{';
                boolean b3 = c == ']' && cStack != '[';
                if (b1 || b2 || b3) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}