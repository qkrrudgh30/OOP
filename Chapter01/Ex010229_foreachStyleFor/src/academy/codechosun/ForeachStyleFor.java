package academy.codechosun;

public class ForeachStyleFor {
    public static void main(String[] args) {
        int i = 1;
        int[] scores = { 91, 96, 89, 100};

        for (int score : scores) {
            System.out.printf("%d/4 score: %d%s", i++, score, System.lineSeparator());
        } 

    }
}

