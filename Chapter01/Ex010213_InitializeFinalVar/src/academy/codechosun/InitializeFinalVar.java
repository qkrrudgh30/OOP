package academy.codechosun;

public class InitializeFinalVar {
    public class Human {
        public final int ID;

        public Human() {
            ID = 20130659;
        }

        public void setId() {
            // ID = 20130659; 언제 getId() 함수가 불릴지 모르므로, 컴파일 에러
        }
    }
    public static void main(String[] args) {
        final float PI = 3.141592f; // 선언과 동시에 초기화 
        final int MAX;

        MAX = 2_147_483_647; // 사용하기 전에 초기화
        System.out.printf("MAX: %d%s", MAX, System.lineSeparator());
    }
}

