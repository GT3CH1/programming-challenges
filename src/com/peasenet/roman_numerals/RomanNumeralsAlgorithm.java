package com.peasenet.roman_numerals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gt3ch1
 * @version 05/09/2023
 */
public class RomanNumeralsAlgorithm {
    private int answer;

    public RomanNumeralsAlgorithm(String numerals) {
        var list = numerals.toCharArray();
        Queue<Integer> queue = new LinkedList<>();
        for (char c : list) {
            var _char = ROMAN_NUMERALS.valueOf(String.valueOf(c));
            queue.add(_char.getValue());
        }
        while (!queue.isEmpty()) {
            var current = queue.remove();
            var next = queue.peek();

            if (next == null) {
                answer += current;
                break;
            }
            if (next > current) {
                var tmp = next - current;
                answer += tmp;
                queue.remove();
                continue;
            }
            answer += current;
        }
    }

    public static String fromDecimal(int decimal) {
        String input = String.valueOf(decimal);
        int digits = input.length();
        char[] chars = input.toCharArray();
        // reverse the list of roman numberals
        ArrayList<ROMAN_NUMERALS> _tmp = new ArrayList<>(Arrays.asList(ROMAN_NUMERALS.values()));
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = chars[i];
            int digit = Character.getNumericValue(c);
            int place = digits - i;
            int power = (int) Math.pow(10, place - 1);


            switch (digit) {
                case 9: {
                    ans.append(_tmp.stream().filter(x -> x.getValue() == power).findFirst().get());
                    ans.append(_tmp.stream().filter(x -> x.getValue() == power * 10).findFirst().get());
                    break;
                }
                case 8, 7, 6, 5: {
                    ans.append(_tmp.stream().filter(x -> x.getValue() == power * 5).findFirst().get());
                    for (int j = 0; j < digit - 5; j++) {
                        ans.append(_tmp.stream().filter(x -> x.getValue() == power).findFirst().get());
                    }
                    break;
                }
                case 4: {
                    ans.append(_tmp.stream().filter(x -> x.getValue() == power).findFirst().get());
                    ans.append(_tmp.stream().filter(x -> x.getValue() == power * 5).findFirst().get());
                    break;
                }
                case 3, 2, 1: {
                    for (int j = 0; j < digit; j++) {
                        ans.append(_tmp.stream().filter(x -> x.getValue() == power).findFirst().get());
                    }
                    break;
                }
            }
        }
        return ans.toString();
    }

    public int getAnswer() {
        return answer;
    }

}
