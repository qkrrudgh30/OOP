package academy.codechosun;

public class Program {
    public static void main(String[] args) {
        Person p0 = new Person("Soo", "Park");
        Person p1 = new Person("Soo", "Park");
        Person p2 = p0;
        
        System.out.println(p0.equals(p1));
        System.out.println(p0.equals(p2));

    }

}



