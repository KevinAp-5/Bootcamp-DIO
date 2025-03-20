package listaalunos;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {

    private Set<Aluno> students;

    public GerenciadorAlunos() {
        this.students = new HashSet<>();
    }

    public boolean addStudent(String name, long registration, double average) {
        return this.students.add(new Aluno(name, registration, average));
    }

    public boolean removeStudent(long registration) {
        return this.students.removeIf(student -> student.getRegistration() == registration);
    }

    public void printStudentsByName() {
        var listStudents = students.stream().toList();
        listStudents.sort(new ComparatorName());
        listStudents.forEach(System.out::println);
    }

    public void printStudentsByAverage() {
        var listStudents = students.stream().toList();
        listStudents.sort(new ComparatorAverage());
        listStudents.forEach(System.out::println);
    }

    public void printStudents() {
        students.forEach(System.out::println);
    }
}
