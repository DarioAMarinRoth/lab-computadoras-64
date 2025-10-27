package app;

import models.Student;
import models.User;

public class Runtime {
    public static void main(String[] args) {

        // Tipo + identificador
        Student miEstudiante = new Student();
        Student otroEstudiante = new Student();
        Student otroEstudiante2 = new Student();
        Student otroEstudiante3 = new Student();
        Student otroEstudiante4 = new Student();

        System.out.println(Student.getTotalStudents());
    }
}
