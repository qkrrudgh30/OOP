package academy.codechosun.models;

public class Athlete {
    private int height;
    private double weight;

    public Athlete(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public final int getHeight() {
        return this.height;
    }

    public final double getWeight() {
        return this.weight;
    }

}



