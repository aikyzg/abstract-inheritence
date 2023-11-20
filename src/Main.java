public class Main {
    public static void main(String[] args){
        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();


        printStudentInformation(students);


         public static void  printStudentInformation(Student[] students) {
            for (Student student : students) {
                System.out.println("Name: " + student.name + " " + student.surname);
                System.out.println("Gender: " + student.gender);
                System.out.println("Education Center: " + student.educationCenter.name);
                System.out.println("Years Studied: " + calculateYearsStudied(student.dateOfStart));
                System.out.println();
            }
            public static int calculateYearsStudied(LocalDate dateOfStart) {
                return LocalDate.now().getYear() - dateOfStart.getYear();
    }
}