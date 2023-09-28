package ro.fasttrackit.exercise1;

import java.util.List;
import java.util.Map;

public class Classroom {
    List<StudentGrade> students;

    public Classroom(List<StudentGrade> students) {
        this.students = students;
    }

    public List<Integer> getGradesForDiscipline(String discipline){
        return null;
    }

    public List<Integer> getGradesForStudent(String student){
        return null;
    }

    public StudentGrade getMaxGrade(String discipline){
        return null;
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
