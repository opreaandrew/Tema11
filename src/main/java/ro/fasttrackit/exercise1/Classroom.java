package ro.fasttrackit.exercise1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private final List<StudentGrade> students;
    private final String fileLocation;


    public Classroom(String fileLocation) throws IOException {
        this.fileLocation = fileLocation;

        this.students = new FileToStudents(fileLocation).readStudentGrades();
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade student : this.students) {
            if (student.discipline().equals(discipline)) {
                grades.add(student.grade());
            }
        }
        return grades;
    }


    public List<Integer> getGradesForStudent(String student) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade requiredStudent : this.students) {
            if (requiredStudent.name().equals(student)) {
                grades.add(requiredStudent.grade());
            }
        }
        return grades;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxGrade = new StudentGrade(null, null, 0);
        for (StudentGrade student : this.students) {
            if (student.discipline().equals(discipline)) {
                if (student.grade() > maxGrade.grade()) {
                    maxGrade = student;
                }
            }
        }
        return maxGrade;
    }

    public StudentGrade getMaxGrade() {
        StudentGrade maxGrade = new StudentGrade(null, null, 0);
        for (StudentGrade student : this.students) {
            if (student.grade() > maxGrade.grade()) {
                maxGrade = student;
            }
        }
        return maxGrade;
    }

    public Integer getAverageGrade(String discipline) {
        List<Integer> grades = new ArrayList();

        for (StudentGrade student : this.students) {
            if (student.discipline().equals(discipline)) {
                grades.add(student.grade());
            }
        }
        int sum = 0;
        int average = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        average = sum / grades.size();
        return average;
    }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade minGrade = new StudentGrade(null, null, 10);
        for (StudentGrade student : this.students) {
            if (student.grade() < minGrade.grade()) {
                minGrade = student;
            }
        }
        return minGrade;
    }

    public Map<String, List<Integer>> getGradesPerDiscipline() {
        Map<String, List<Integer>> gradesPerDiscipline = new HashMap<>();

        for (StudentGrade student : this.students) {
            if(!gradesPerDiscipline.containsKey(student.discipline())){
                List<Integer> grades = getGradesForDiscipline(student.discipline());
                gradesPerDiscipline.put(student.discipline(), grades);
            }
        }
        return gradesPerDiscipline;
    }

}
