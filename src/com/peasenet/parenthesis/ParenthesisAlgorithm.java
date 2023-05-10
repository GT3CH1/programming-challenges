package com.peasenet.parenthesis;

import java.util.Stack;

/**
 * @author gt3ch1
 * @version 05/10/2023
 */
public class ParenthesisAlgorithm {
    public static boolean isValid(String s) {
        Stack<Character> queue = new Stack<>();
        char[] list = s.toCharArray();
        for (char c : list) {
            if (queue.isEmpty() && isClosing(c))
                return false;
            if (!queue.isEmpty() && isClosing(c)) {
                var tmp = queue.peek();
                if (!isPair(tmp, c))
                    return false;
                queue.pop();
                continue;
            }
            if (isOpening(c))
                queue.push(c);
        }
        return queue.isEmpty();
    }

    public static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isClosing(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    public static boolean isPair(char c, char c2) {
        return (c == '(' && c2 == ')') || (c == '{' && c2 == '}') || (c == '[' && c2 == ']');
    }
}
