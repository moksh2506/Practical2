package com.company;

public class pr2_5 {

    private String Number(int value) {
        return String.format("%d", value);
    }

    private String Number(double value) {
        return String.format("%.3f", value);
    }

    private String Number(String value) {
        return String.format("%.5f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        pr2_5 hs = new pr2_5();
        System.out.println(hs.Number(100));
        System.out.println(hs.Number(99.9999));
        System.out.println(hs.Number("100"));
    }
}