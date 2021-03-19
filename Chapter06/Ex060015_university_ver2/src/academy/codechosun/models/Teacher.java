package academy.codechosun.models;

public class Teacher extends Person {
    private Department department;

    public Teacher(String firstName, String lastName, Department department) {
        super(firstName, lastName);

        this.department = department;

    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}



