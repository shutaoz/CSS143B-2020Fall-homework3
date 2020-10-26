package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        LinkedListStack<Character> pStack = new LinkedListStack<>();
        if(str != null) {
            for (int i = 0; i < str.length(); i++) {
                char paren = str.charAt(i);
                if (paren == '(' || paren == '{' || paren == '[')
                    pStack.push(paren);
                else {
                    if (pStack.size() == 0) return false;
                    char pair = pStack.pop();
                    boolean match = false;
                    if (pair == '(')
                        match = (paren == ')');
                    else if (pair == '{')
                        match = (paren == '}');
                    else if (pair == '[')
                        match = (paren == ']');

                    if (!match) return false;
                }
            }
        }
        return pStack.size() == 0;
    }
}
