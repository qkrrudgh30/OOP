package academy.codechosun;

public class AssignmentOperator {
    public static class Vector {
        int x;
        int y;

        public Vector(int op1, int op2) {
            this.x = op1;
            this.y = op2;
        }
    }

    public static void main(String[] args) {
        int midScore = 92;
        int finScore = midScore;
        System.out.printf("midScore: %d%s", midScore, System.lineSeparator());
        System.out.printf("finScore: %d%s", finScore, System.lineSeparator());
        finScore = 100;
        System.out.printf("midScore: %d%s", midScore, System.lineSeparator());
        System.out.printf("finScore: %d%s", finScore, System.lineSeparator());

        Vector v1 = new Vector(10, 20);
        Vector v2 = v1;    
        System.out.printf("v1.x: %d\tv1.y: %d%s", v1.x, v1.y, System.lineSeparator());
        System.out.printf("v2.x: %d\tv2.y: %d%s", v2.x, v2.y, System.lineSeparator());
        v2.x = 25;
        System.out.printf("v1.x: %d\tv1.y: %d%s", v1.x, v1.y, System.lineSeparator());
        System.out.printf("v2.x: %d\tv2.y: %d%s", v2.x, v2.y, System.lineSeparator());

        String name1 = "Park";
        String name2 = name1;    
        System.out.printf("name1: %s%s", name1, System.lineSeparator());
        System.out.printf("name2: %s%s", name2, System.lineSeparator());
        name2 = "Bark";
        System.out.printf("name1: %s%s", name1, System.lineSeparator());
        System.out.printf("name2: %s%s", name2, System.lineSeparator());

    }
}

