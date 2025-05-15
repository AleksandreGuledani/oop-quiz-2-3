package oop.q3;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s.name + " " + s.surname + " from " + s.country);
        }
    }

    public String getStudentInfoStrange(Student s) {
        // Define your own identity here
        String myName = "Aleksandre";
        String mySurname = "Guledani";
        String personalNumber = "01024075949";
        String[] courseTitles = {"Object Oriented Programming", "Computer organization", "Calculus II", "English Language Course C1-2", "Mathematical Foundation of Computing"};

        boolean isMe = s.name.equals(myName) && s.surname.equals(mySurname);
        boolean containsStudent = students.contains(s);

        if (isMe && containsStudent) {
            return String.join(", ", courseTitles);
        } else if (isMe && !containsStudent) {
            return personalNumber;
        } else {
            for (Student stu : students) {
                if (stu.equals(s)) {
                    return stu.info;
                }
            }
        }
        return null;
    }
}
