package academy.codechosun;

public class ContinueWithLabel {
    public static void main(String[] args) {
        loop_exit:
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (i < j) {
                    System.out.printf("%s", System.lineSeparator());
                    continue loop_exit;
                } else {
                    System.out.printf("*");
                }
            }
        }
    }
}
