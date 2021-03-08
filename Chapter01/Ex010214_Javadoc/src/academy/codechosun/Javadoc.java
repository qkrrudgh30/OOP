package academy.codechosun;

public class Javadoc {
    /**
     * Returns the sum of the arguments
     * @param op1 the first value
     * @param op2 the second value
     * @return the result
    */
    public static int add(final int op1, final int op2) {
        return op1 + op2;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int res = add(a, b);
    }    
}

