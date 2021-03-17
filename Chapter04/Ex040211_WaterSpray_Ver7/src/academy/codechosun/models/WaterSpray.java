package academy.codechosun.models;

public class WaterSpray {
    private SprayHead head;
    private SprayBottle bottle;

    public WaterSpray(SprayHead head, SprayBottle bottle) {
        this.head = head;
        this.bottle = bottle;
    }

    public WaterSpray(SprayHeadSpeed speed, SprayBottleSize size) {
        switch (speed) {
            case SLOW:
                this.head = new SprayHead(1);
                break;
            case MEDIUM:
                this.head = new SprayHead(5);
                break;
            case FAST:
                this.head = new SprayHead(10);
                break;
            default:
                assert (false) : "Unrecognized " + speed.getClass().getName() + ": " + speed; 
                break;
        }

        switch (size) {
            case SMALL:
                this.bottle = new SprayBottle(10);
                break;
            case MEDIUM:
                this.bottle = new SprayBottle(50);
                break;
            case LARGE:
                this.bottle = new SprayBottle(100);
                break;
            default:
                assert (false) : "Unrecognized " + size.getClass().getName() + ": " + size; 
                break;

        }
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



