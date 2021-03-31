package academy.codechosun.models;

public abstract class Head {
    private int fovAngle;

    public Head(int fovAngle) {
        this.fovAngle = fovAngle;
    }

    protected Robot pickEnemy() {}
}
