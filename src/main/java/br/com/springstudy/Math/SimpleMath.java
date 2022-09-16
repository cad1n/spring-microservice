package br.com.springstudy.Math;

public class SimpleMath {

    public double sum(Double num1, Double num2) {
        return num1 + num2;
    }

    public double subtract(Double num1, Double num2) {
        return num1 - num2;
    }

    public double multiply(Double num1, Double num2) {
        return num1 * num2;
    }

    public double divide(Double num1, Double num2) {
        return num1 / num2;
    }

    public double media(Double num1, Double num2) {
        return (num1 + num2) / 2;
    }

    public double sqrt(Double num) {
        return Math.sqrt(num);
    }
}
