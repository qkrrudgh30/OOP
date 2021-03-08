package academy.codechosun;

public class ImmutableString {
    public static void main(String[] args) {
        String myName = "Bark";

        System.out.printf("My name is %s.%s", myName, System.lineSeparator());
        myName[0] = 'P';
        System.out.printf("Oops, my name is %s.%s", myName, System.lineSeparator());
    }
}

