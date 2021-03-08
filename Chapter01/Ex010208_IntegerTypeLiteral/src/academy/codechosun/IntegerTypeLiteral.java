package academy.codechosun;

public class IntegerTypeLiteral {
    public static void main(String[] args) {
        int int_num = 1234;
        long long_num1 = 2147483647;
        //long long_num2 = 2200000000; this does not compile.
        long long_num2 = 2200000000L;

        System.out.printf("%d\n%d\n%d\n", int_num, long_num1, long_num2);

        int bin_num = 0b10110100;
        int oct_num = 01212;
        int hex_num = 0xFFCF;

        System.out.printf("%d\n%d\n%d\n", bin_num, oct_num, hex_num);

    }
}
