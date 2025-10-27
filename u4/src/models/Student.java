package models;

public class Student {
    private String name;
    private int age;
    private final int ID_STUDENT; // Una constante
    private static int totalStudents = 0;

    public void setAge(int age) {
        // Validar
        if (age < 13 || age > 20) {
            System.out.println("No se asigno la edad porque no está dentro del rango válido.");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Student() {
        totalStudents++;
        this.ID_STUDENT = totalStudents;
    }

    public int getID_STUDENT() {
        return ID_STUDENT;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
