package model;

import java.util.List;

import model.impl.Student;
import model.impl.Teacher;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return String.format("УчебнаяГруппа: преподаватель = %s, студенты = %s", teacher, students);
    }
}
