import java.util.List;

import javax.security.auth.Subject;

public class StudyProgram {
    private List<Subject> subjects; 

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}
