package com.example;

public class JavaApp {

    public static void main(String arg[]) {
        System.out.println("Java: Hello world!");
        Summator summator = new Summator(1, 2);
        String s = "sum = " + summator.sum();
        System.out.println(s);
    }

    static class Summator {

        private final int a;
        private final int b;

        Summator(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int sum() {
            return a + b;
        }

    }

}
