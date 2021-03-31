package academy.codechosun.models;

public final class Head implements IHead {
    private int fovAngle;

    public Head(int fovAngle) {
        this.fovAngle = fovAngle;
    }

    protected IRobot pickEnemy() {}
}
