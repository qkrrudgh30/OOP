package academy.codechosun;

public class StringClass {
    public static void main(String[] args) {
        String helloWorld = "Hello, world!";
        String alphaBetaGamma = "\u03b1\u03b2\u03b3";
        String helloNewLineWorld = "Hello\nworld";

        System.out.printf("%s%s", helloWorld, System.lineSeparator());
        System.out.printf("%s%s", alphaBetaGamma, System.lineSeparator());
        System.out.printf("%s%s", helloNewLineWorld, System.lineSeparator());

        String name1 = "Park";
        String name2 = new String(name1);
        String name3 = new String("Bark");

        System.out.printf("%s\t%s\t%s%s", name1, name2, name3, System.lineSeparator());

    }
}

