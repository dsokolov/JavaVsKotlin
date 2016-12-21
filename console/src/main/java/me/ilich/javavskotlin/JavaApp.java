package me.ilich.javavskotlin;

public class JavaApp {

    public static void main(String arg[]) {
        System.out.println("Java: Hello world!");
        Summator summator = new Summator(1, 2);
        String s = "sum = " + summator.sum();
        System.out.println(s);
        KotlinUser user = new KotlinUser("1", 2);


        final int a;
        if (s.length() == 5) {
            a = 10;
        } else {
            a = 8;
        }

        int b = s.length() == 5 ? 10 : 8;

        UrilsKt.sayHello("asdf");
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
