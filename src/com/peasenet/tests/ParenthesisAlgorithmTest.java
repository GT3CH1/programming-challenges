package com.peasenet.tests;

import com.peasenet.parenthesis.ParenthesisAlgorithm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author gt3ch1
 * @version 05/10/2023
 */
public class ParenthesisAlgorithmTest {
    @Test
    void simple() {
        var str = "({[]})";
        var res = ParenthesisAlgorithm.isValid(str);
        Assertions.assertTrue(res, "Expected true but got " + res);
    }

    @Test
    void simple2() {
        var str = "()";
        var res = ParenthesisAlgorithm.isValid(str);
        Assertions.assertTrue(res, "Expected true but got " + res);
    }

    @Test
    void simple_bad() {
        var str = "({[})";
        var res = ParenthesisAlgorithm.isValid(str);
        Assertions.assertFalse(res, "Expected false but got " + res);
    }

    @Test
    void simple_bad_2() {
        var str = "(";
        var res = ParenthesisAlgorithm.isValid(str);
        Assertions.assertFalse(res, "Expected false but got " + res);
    }

    @Test
    void simple_bad_3() {
        var str = "([)]";
        var res = ParenthesisAlgorithm.isValid(str);
        Assertions.assertFalse(res, "Expected false but got " + res);
    }
}
