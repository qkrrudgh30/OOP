package academy.codechosun.models;

public class WaterSpray {
    private SprayHead head;
    private SprayBottle bottle;

    public WaterSpray(SprayHead head, SprayBottle bottle) {
        this.head = head;
        this.bottle = bottle;
    }

    public SprayHead getHead() {
        return this.head;
    }

    public SprayBottle getBottle() {
        return this.bottle;
    }

    public void setHead(SprayHead head) {
        this.head = head;
    }

    public void setBottle(SprayBottle bottle) {
        this.bottle = bottle;
    }

}



