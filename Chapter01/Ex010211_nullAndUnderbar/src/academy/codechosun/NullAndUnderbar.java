package academy.codechosun;

public class NullAndUnderbar {
    public static void main(String[] args) {
        String reference = null;
        long L_num = 2_147_483_649L;
        long hex_num = 0xFB_BC_8E_A8;

        System.out.printf("L_num: %d%s", L_num, System.lineSeparator());
        System.out.printf("hex_num: %d%s", hex_num, System.lineSeparator());

    }
}

