package academy.codechosun.models;

public class SprayHead {
    private int sprayAmount;

    public SprayHead(int sprayAmount) {
        this.sprayAmount = sprayAmount;
    }

    public void sprayFrom(SprayBottle bottle) {
        bottle.reduceWater(sprayAmount);
    }

}



