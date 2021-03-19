package academy.codechosun.config;

public class Configuration {
    private static Configuration instance;
    private int x;
    private int y;
    private int width;
    private int height;

    private Configuration() {}

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }

        return instance;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void load(String fileName) {
        System.out.printf("Loading %s.%s", fileName, System.lineSeparator());
    }

    public void save(String fileName) {
        System.out.printf("Saving %s.%s", fileName, System.lineSeparator());
    }

}



