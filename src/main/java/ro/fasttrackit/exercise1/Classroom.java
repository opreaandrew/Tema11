package ro.fasttrackit.exercise1;

import java.io.IOException;
import java.util.ArrayList;
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
        for (StudentGrade student : students) {
            if (student.discipline().equals(discipline)) {
                grades.add(student.grade());
            }
        }
        return grades;
    }


    public List<Integer> getGradesForStudent(String student){
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade requiredStudent : students) {
            if (requiredStudent.name().equals(student)) {
                grades.add(requiredStudent.grade());
            }
        }
        return grades;
    }

    public StudentGrade getMaxGrade(String discipline){
        StudentGrade maxGrade = new StudentGrade(null, null, 0);
        for (StudentGrade student : students) {
            if (student.discipline().equals(discipline)) {
                if(student.grade() > maxGrade.grade()){
                    maxGrade = student;
                }
            }
        }
        return maxGrade;
    }

    public StudentGrade getMaxGrade(){
        return null;
    }

    public Integer getAverageGrade(String discipline){
        return null;
    }

    public StudentGrade getWorstGrade(String discipline){
        return null;
    }

    public Map<String, List<Integer>> getGradesPerDiscipline(){
        return null;
    }

}
