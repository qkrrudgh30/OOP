package academy.codechosun;

public class ArithmeticOperator {
    public static void main (String[] args) {
        int midScore = 89;
        int finScore = 92;
        int total = midScore + finScore;
        // boolean passOrNot = true + false; this does not compile
        char b = 'a' + 1;

        System.out.printf("midScore: %d%s", midScore, System.lineSeparator());
        System.out.printf("finScore: %d%s", finScore, System.lineSeparator());
        System.out.printf("total: %d%s", total, System.lineSeparator());
        System.out.printf("b: %c", b);

    }
}