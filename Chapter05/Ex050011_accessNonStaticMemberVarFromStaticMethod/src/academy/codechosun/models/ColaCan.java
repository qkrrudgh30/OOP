package academy.codechosun.models;

public class ColaCan {
    private int remainingInMl;
    private static int createdCount;
    
    public ColaCan() {
        createdCount++;
    }

    public static int getCreatedCount() {
        System.out.printf("remainingInMl: %d%s", this.remainingInMl);

        return createdCount;
        
    }

}



