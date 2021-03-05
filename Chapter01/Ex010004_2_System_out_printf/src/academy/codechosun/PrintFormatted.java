package Ex010004_2_System_out_printf.src.academy.codechosun;

public class PrintFormatted {
    public static void main(String[] args) {
        System.out.println("Hello, world! (with printline)");
        System.out.printf("Goodbye, world~ ");
        System.out.printf("(with printformatted)\n");
        String name = "Park";
        int score = 98;
        System.out.printf("%s: %d\n", name, score);
    }
}