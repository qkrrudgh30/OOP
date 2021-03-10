package academy.codechosun;

public class IncompletedClass {
    class Human {
        String name;
        float weight;

        void walk() {
            weight -= 1;
        }
        
        void eat() {
            weight += 1;
        }

        void speak() {
            System.out.println("Hello!");
        }
    }

    public static void main(String[] args) {
        
    }
}
