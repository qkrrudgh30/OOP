package academy.codechosun.models;

public class ColaCan {
    private static int createdCount;

    public ColaCan() {
        createdCount++;
        /* == this.createdCount++; */
        /* == ColaCan.createdCount++; */
        
        System.out.printf("createdCount: %d%s", createdCount, System.lineSeparator());
        
    }

}



