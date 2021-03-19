package academy.codechosun.baseentity;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.UUID;

public class Course extends BaseEntity {
    private String courceCode;
    private String title;
    private ArrayList<CourseTerm> courseTerms;

    public Course(UUID id, OffsetDateTime createdDateTime, OffsetDateTime modifiedDateTime, String courseCode, String title) {
        super(id, createdDateTime, modifiedDateTime);
        this.courseCode = courseCode;
        this.title = title;
        this.courseTerms = new ArrayList<>();
    }

    public String getCourseCode() {
        return this.courceCode;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<CourseTerm> getCourseTerms() {
        return this.courseTerm;
    }

    public void setCourseTerms(ArrayList<CourseTerm> courseTerms) {
        this.courseTerms = courseTerms;
    }

    public void addCourseTerms(int term) {
        CourseTerm courseTerm = new CourseTerm(UUID.randomUUID(), OffsetDateTime.now(ZoneOffset.UTC), OffsetDateTime.now(ZoneOffset.UTC), this, term);

        this.courseTerms.add(courseTerms);
    }

}
