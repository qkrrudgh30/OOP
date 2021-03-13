package academy.codechosun.character;

public class Human {
    private String name;
    private float weight;
    private float height;
    private float stdWeight;
    private float bmi;

    public Human(String name, float weight, float height) {
        this.name = name;
        this.weight = weight;
        this.height = height;

        updateStdWeightAndBmi();
    }

    public void walk() {
        this.weight -= 1;

        updateStdWeightAndBmi();

    }

    public void eat() {
        this.weight += 1;

        updateStdWeightAndBmi();

    }

    private void updateStdWeightAndBmi() {
        this.stdWeight = (this.height - 100) * 0.9f;
        this.bmi = (this.weight / this.stdWeight) * 100.f;
        
        System.out.printf("stdWeight: %.1f\tbmi: %.1f%s", this.stdWeight, this.bmi, System.lineSeparator());

    }



}

