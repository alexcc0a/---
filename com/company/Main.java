package com.company;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1); // получаем 0
        int c = calc.divide.apply(a, b); // делим на 0.


        calc.println.accept(c);
        calc.println.accept(calc.multiply.apply(65, 46));
        calc.println.accept(calc.pow.apply(6));
        calc.println.accept(calc.abs.apply(-100));

        calc.println.accept(calc.isPositive.test(-46) ? 1 : 0);
    }
}