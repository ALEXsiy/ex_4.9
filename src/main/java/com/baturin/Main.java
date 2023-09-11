package com.baturin;

public class Main {
    public static void main(String[] args) {
        double a = 2.5;
        double b = 0.5;
        //double b =0D;
        //Сложение
        Calculator calculator = new Calculator(new Adder());
        calculator.calc(a, b);
        //Вычитание
        calculator = new Calculator(new Subtractor());
        calculator.calc(a, b);
        //Умножение
        calculator = new Calculator(new Multiplier());
        calculator.calc(a, b);
        //Деление a/b
        calculator = new Calculator(new Divider());
        calculator.calc(a, b);

    }
}