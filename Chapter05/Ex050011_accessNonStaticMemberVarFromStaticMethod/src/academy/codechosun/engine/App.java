package academy.codechosun.engine;

import academy.codechosun.models.ColaCan;

public class App {
    public static void main(String[] args) {
        ColaCan cola1 = new ColaCan();
        System.out.printf("createdCount: %d%s", cola1.getCreatedCount(), System.lineSeparator());
        ColaCan cola2 = new ColaCan();
        System.out.printf("createdCount: %d%s", cola2.getCreatedCount(), System.lineSeparator());

    }

}



