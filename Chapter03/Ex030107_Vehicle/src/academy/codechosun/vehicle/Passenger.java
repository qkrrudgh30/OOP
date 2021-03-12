package academy.codechosun.vehicle;

public class Passenger {
    public String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.printf("Hello, I'm %s!%s", this.name, System.lineSeparator());
    }

}



