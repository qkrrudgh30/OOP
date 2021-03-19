package academy.codechosun.models;

public class ColaCan {
    private static int createdCount;

    public ColaCan() {
        createdCount++;
    }

    public static int getCreatedCount() {
        return createdCount;
    }

}



