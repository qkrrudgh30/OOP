package academy.codechosun;

public class BreakWithLabel {
    public static void main(String[] args) {
        final int DEPTH = 3;
        final int HEIGHT = 3;
        final int WIDTH = 3;
        int count = 0;

        loop_exit:
        for (int i = 0; i < DEPTH; ++i) {
            for (int j = 0; j < HEIGHT; ++j) {
                for (int k = 0; k < WIDTH; ++k) {
                    if (count == 7) {
                        break loop_exit;
                    } else {
                        System.out.printf("count: %d ", count++);
                    }
                }
            }
        }
        System.out.printf("Exiting loop!");
    }
}

