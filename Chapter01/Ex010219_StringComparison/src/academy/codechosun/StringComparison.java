package academy.codechosun;

public class StringComparison {
    public static void main(String[] args) {
        String name1 = "Park";
        String name2 = "Park";
        String name3 = new String(name1);
        String name4 = new String("Park");

        boolean isSame1 = (name1 == name2);
        boolean isSame2 = (name1 == name3);
        boolean isSame3 = (name1 == name4);
        boolean isSame4 = (name1 == "Park");

        System.out.printf("%b %b %b %b", isSame1, isSame2, isSame3, isSame4);
        
    }
}

