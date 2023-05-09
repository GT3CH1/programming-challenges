package com.peasenet.roman_numerals;

/**
 * @author gt3ch1
 * @version 05/09/2023
 */
public enum ROMAN_NUMERALS {

    I('I', 1),
    V('V', 5),
    X('X', 10),
    L('L', 50),
    C('C', 100),
    D('D', 500),
    M('M', 1000),
    i('i', 1000),
    v('v', 5000),
    x('x', 10000),
    l('l', 50000),
    c('c', 100000),
    d('d', 500000),
    m('m', 1000000);

    private int value;

    ROMAN_NUMERALS(char val, int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
