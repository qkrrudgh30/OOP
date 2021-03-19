package academy.codechosun.models;

public class Teacher {
    private Department department;

    public Teacher(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}



