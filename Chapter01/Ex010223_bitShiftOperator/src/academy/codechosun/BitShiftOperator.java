package academy.codechosun;

public class BitShiftOperator {
    public static void main(String[] args) {
        int operand = 11;    // 0b1011
        int twiceOfOperand = operand << 1;
        int halfOfOperand = operand >> 1;
        int num1 = -2147483648;    // 0XFFFF FFFF 8000 0001
        int num2 = -2147483648;
        int halfOfNum1 = num1 >> 1;
        int halfOfNum2 = num2 >>> 1;

        System.out.printf("%d %d %d%s", operand, twiceOfOperand, halfOfOperand, System.lineSeparator());
        System.out.printf("%d %d%s", halfOfNum1, halfOfNum2, System.lineSeparator());

    }
}
