import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private String  gender;
    private LocalDate  dateOfStart;
   private  EducationCenter educationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }
}
