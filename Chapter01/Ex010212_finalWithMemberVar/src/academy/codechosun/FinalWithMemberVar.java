package academy.codechosun;

public class FinalWithMemberVar {
    public class Human {
        public final int ID = 20130659;
    }
    public static void main(String[] args) {
        final float PI = 3.141592f;

        System.out.printf("PI: %f%s", PI, System.lineSeparator());

        //PI = 1.124f; this does not compile.

        Human me = new Human(); // non-static variable this cannot be referenced from a static context

        System.out.printf("my ID: %d%s", me.ID, System.lineSeparator());

        //me.ID = 20200659; this does not compile.
    }

    public int add(final int op1, final int op2) {
        //op2 += 1; this does not compile.
    }
}
