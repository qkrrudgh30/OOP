package academy.codechosun;

public class StringWithOperatorOverloading {
    public static void main(String[] args) {
        String str = "My id: ";
        str += 20130659;
        System.out.printf("%s%s", str, System.lineSeparator());

        String hello = "Hello, ";
        String world = "world!";
        String helloWorld = hello + world;
        System.out.printf("%s%s", helloWorld, System.lineSeparator());
        
    }
}