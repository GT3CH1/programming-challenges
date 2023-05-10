package com.peasenet.tests;

import com.peasenet.roman_numerals.RomanNumeralsAlgorithm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author gt3ch1
 * @version 05/09/2023
 */
public class RomanNumeralTest {
    private RomanNumeralsAlgorithm algorithm;

    @Test
    void simple_3() {
        var expected = 3;
        var string = "III";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void simple_5() {
        var expected = 5;
        var string = "V";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void simple_10() {
        var expected = 10;
        var string = "X";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void simple_50() {
        var expected = 50;
        var string = "L";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void simple_100() {
        var expected = 100;
        var string = "C";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void simple_500() {
        var expected = 500;
        var string = "D";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void simple_1000() {
        var expected = 1000;
        var string = "M";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void simple_subtract_4() {
        var expected = 4;
        var string = "IV";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
        var res2 = RomanNumeralsAlgorithm.fromDecimal(expected);
        Assertions.assertEquals(string, res2, "Expected " + string + " but got " + res2);
    }


    @Test
    void simple_8() {
        var expected = 8;
        var string = "VIII";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void simple_VIII() {
        var expected = "VIII";
        var res = RomanNumeralsAlgorithm.fromDecimal(8);
        Assertions.assertEquals(expected, res, "Expected " + expected + " but got " + res);
    }

    @Test
    void simple_14() {
        var expected = 14;
        var string = "XIV";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void simple_19() {
        var expected = 19;
        var string = "XIX";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void complex_87() {
        var expected = 87;
        var string = "LXXXVII";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void complex_LXXXVII() {
        var expected = "LXXXVII";
        var res = RomanNumeralsAlgorithm.fromDecimal(87);
        Assertions.assertEquals(expected, res, "Expected " + expected + " but got " + res);
    }

    @Test
    void complex_6123() {
        var expected = 6123;
        var string = "vMCXXIII";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void complex_vMCXXIII() {
        var expected = "vMCXXIII";
        var res = RomanNumeralsAlgorithm.fromDecimal(6123);
        Assertions.assertEquals(expected, res, "Expected " + expected + " but got " + res);
    }

    @Test
    void complex_3708() {
        var expected = 3708;
        var string = "MMMDCCVIII";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void complex_MMMDCCVIII() {
        var expected = "MMMDCCVIII";
        var res = RomanNumeralsAlgorithm.fromDecimal(3708);
        Assertions.assertEquals(expected, res, "Expected " + expected + " but got " + res);
    }


    @Test
    void complex_86327() {
        var expected = 86327;
        var string = "lxxxvMCCCXXVII";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void complex_lxxxvMCCCXXVII() {
        var expected = "lxxxvMCCCXXVII";
        var res = RomanNumeralsAlgorithm.fromDecimal(86327);
        Assertions.assertEquals(expected, res, "Expected " + expected + " but got " + res);
    }

    @Test
    void complex_179636() {
        var expected = 179636;
        var string = "clxxMxDCXXXVI";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void copmlex_clxxMxDCXXXVI() {
        var expected = "clxxMxDCXXXVI";
        var res = RomanNumeralsAlgorithm.fromDecimal(179636);
        Assertions.assertEquals(expected, res, "Expected " + expected + " but got " + res);
    }

    @Test
    void simple_li() {
        var expected = 51;
        var string = "LI";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void complex_183949() {
        var expected = 183949;
        var string = "clxxxMMMCMXLIX";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void complex_clxxxMMMCMXLIX() {
        var expected = "clxxxMMMCMXLIX";
        var res = RomanNumeralsAlgorithm.fromDecimal(183949);
        Assertions.assertEquals(expected, res, "Expected " + expected + " but got " + res);
    }

    @Test
    void from_decimal_51() {
        var expected = 51;
        var input = "LI";
        var res = RomanNumeralsAlgorithm.fromDecimal(expected);
        Assertions.assertEquals(input, res, "Expected " + input + " but got " + res);
    }

    @Test
    void complex_84738() {
        var expected = 84738;
        var string = "lxxxivDCCXXXVIII";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }


    @Test
    void complex_491388() {
        var expected = 491388;
        var string = "cdxcMCCCLXXXVIII";
        var res = new RomanNumeralsAlgorithm(string);
        Assertions.assertEquals(expected, res.getAnswer(), "Expected " + expected + " but got " + res.getAnswer());
    }

    @Test
    void complex_cdxcMCCCLXXXVIII() {
        var expected = "cdxcMCCCLXXXVIII";
        var res = RomanNumeralsAlgorithm.fromDecimal(491388);
        Assertions.assertEquals(expected, res, "Expected " + expected + " but got " + res);
    }

}
