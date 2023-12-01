import javax.security.auth.Subject;

public class SistemsDegree implements Career {
    
    private StudyProgram studyProgram; 

    @Override
    public void setStudyProgram(StudyProgram studyProgram){
        this.studyProgram = studyProgram;
    };

    public void showProgram() {
        for (Subject subject : studyProgram.getSubjects()) {
            System.out.println(subject);
        }
        
    }
}
