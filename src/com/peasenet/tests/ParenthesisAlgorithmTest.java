package com.peasenet.tests;

import com.peasenet.parenthesis.ParenthesisAlgorithm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

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

    @Test
    void simple_bad_4() {
        var str = "{{]}";
        var res = ParenthesisAlgorithm.isValid(str);
        Assertions.assertFalse(res, "Expected false but got " + res);
    }

    @Test
    void simple_bad_5() {
        var str = "({)}";
        var res = ParenthesisAlgorithm.isValid(str);
        Assertions.assertFalse(res, "Expected false but got " + res);
    }

    @Test
    void complex_good_1() {
        var str = "([{([{}])}])";
        var res = ParenthesisAlgorithm.isValid(str);
        Assertions.assertTrue(res, "Expected true but got " + res);
    }

    @Test
    void simple_good() {
        var str = "(){}[]";
        var res = ParenthesisAlgorithm.isValid(str);
        Assertions.assertTrue(res, "Expected true but got " + res);
    }

    @Test
    void edge_case() {
        var res = ParenthesisAlgorithm.isValid("(");
        Assertions.assertFalse(res, "Expected true but got " + res);
        res = ParenthesisAlgorithm.isValid("[");
        Assertions.assertFalse(res, "Expected true but got " + res);
        res = ParenthesisAlgorithm.isValid("{");
        Assertions.assertFalse(res, "Expected true but got " + res);
        res = ParenthesisAlgorithm.isValid("(}");
        Assertions.assertFalse(res, "Expected false but got " + res);
        res = ParenthesisAlgorithm.isValid("]");
        Assertions.assertFalse(res, "Expected false but got " + res);
        res = ParenthesisAlgorithm.isValid("[()");
    }
}
