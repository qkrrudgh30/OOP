package academy.codechosun.models;

public class BasketballPlayer extends Athlete {
    public BasketballPlayer(int height, double weight) {
        super(height, weight);
    }

    public int getHeight() {
        return super.getHeight() + 5;
    }

}



