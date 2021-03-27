package academy.codechosun;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || !(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;
        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName);

    }

}



