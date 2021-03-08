package academy.codechosun;

public class IntegerClass {
    public static void main(String[] args) {
        // int num = 4294967295;    this does not compile.
        int num = Integer.parseUnsignedInt("4294967295");

        System.out.printf("num: %d%s", num, System.lineSeparator());

        String numString = Integer.toUnsignedString(num);

        System.out.printf("numString: %s%s", numString, System.lineSeparator());

    }
}
