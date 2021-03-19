package academy.codechosun.modules;

public class Math {
    private static Math instance;

    private Math() {}

    public static Math getInstance() {
        if (instance == null) {
            instance = new Math();
        }

        return instance;

    }

    public int abs(int n) {
        return n < 0 ? -n : n;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }

    public int max(int a, int b) {
        return a < b ? b : a;
    }

}



