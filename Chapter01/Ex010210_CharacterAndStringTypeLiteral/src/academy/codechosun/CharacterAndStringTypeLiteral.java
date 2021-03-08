package academy.codechosun;

public class CharacterAndStringTypeLiteral {
    public static void main(String[] args) {
        char ch = 'P';
        String helloWorld = "Hello, world!";
        String alphaBetaGamma = "\u03b1\u03b2\u03b3";
        String helloNewlineWorld = "Hello,\nworld!";

        System.out.printf("ch: %c%s", ch, System.lineSeparator());
        System.out.printf("helloWorld: %s%s", helloWorld, System.lineSeparator());
        System.out.printf("alphaBetaGamma: %s%s", alphaBetaGamma, System.lineSeparator());
        System.out.printf("helloNewlineWorld: %s", helloNewlineWorld);
        
    } 
} 