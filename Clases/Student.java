import java.util.List;

class Student {
    private Career SignedCareer; //strategy 
    private List<Subject> SubjectsPassed;
    private List<Subject> SubjectSigned;
    private String name;
    private String lastname;
    private String email;

    Student(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public void SignCareer(Career career) { //elige estrategia (carrera)
        this.SignedCareer = career;
    }


    public void ShowSignableSubjects() {
        
    }

}