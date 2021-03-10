package academy.codechosun;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

public class Function {
    public class Vector {
        public float x;
        public float y;

        public Vector(float op1, float op2) {
            this.x = op1;
            this.y = op2;
        }
    }

    public static Vector add(Vector v1, Vector v2) {
        v1.x += 100.0f;
    }

    public static void main(String[] args) {
        Vector v1 = new Vector(1, 3);
        Vector v2 = new Vector(2, 5);
        Vector v3 = add(v1, v2);

        System.out.printf("v1.x: %d\tv1.y: %d%s", v1.x, v1.y, System.lineSeparator());

    }
}


