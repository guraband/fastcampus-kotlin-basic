package kotlinjava.getterSetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kim");
        student.setBirthDate(LocalDate.of(2010, 1, 5));
        student.changeGrade("A");
        student.gender = Gender.MALE;
        System.out.printf("- name : %s / birthDate : %s / grade : %s\n", student.getName(), student.getBirthDate(), student.getGrade());

        DataStudent dataStudent = new DataStudent("Lee", LocalDate.of(2011, 2, 6));
        System.out.println(dataStudent);
    }
}