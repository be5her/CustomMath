package com.example.myutils;

public class MyMath {
    public static double Plus(double a, double b){
        return  a + b;
    }

    public static double Minus(double a, double b){
        return  a - b;
    }

    public static double Times(double a, double b){
        return  a * b;
    }

    public static double Div(double a, double b){
        if (b == 0) throw new IllegalArgumentException("Div by zero");

        return  a / b;
    }
}
