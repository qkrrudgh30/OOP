package academy.codechosun.school;

public class Classroom {
    private float[] scores = new float[30];

    public Classroom() {
        for (int i = 1; i < 30; ++i) {
            this.scores[i] = i + 10;
        }
    }

    public void printSum() {
        float sum = getSum();

        System.out.printf("Sum: %.2f%s", sum, System.lineSeparator());

    }

    public void printMean() {
        float sum = getSum();

        System.out.printf("Mean: %.2f%s", sum / this.scores.length, System.lineSeparator());
    }

    private float getSum() {
        float sum = 0.f;

        for (int i = 0; i < this.scores.length; ++i) {
            sum += this.scores[i];
        }

        return sum;
    }

}



