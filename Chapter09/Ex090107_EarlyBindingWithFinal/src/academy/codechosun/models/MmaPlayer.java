package academy.codechosun.models;

public class MmaPlayer extends Athlete {
    public MmaPlayer(int height, double weight) {
        super(height, weight);
    }

    public double getWeight() {
        return super.getWeight() - 5.0;
    }

}



