package ro.fasttrackit;

import ro.fasttrackit.exercise1.Classroom;
import ro.fasttrackit.exercise1.FileToStudents;
import ro.fasttrackit.exercise2.ReportGenerator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileToStudents grades = new FileToStudents("Files/grades.txt");
        System.out.println(grades.readStudentGrades());

        Classroom classroom = new Classroom(("Files/grades.txt"));
        System.out.println(classroom.getGradesForDiscipline("Computer Science"));
        System.out.println(classroom.getGradesForStudent("Demetria Cosme"));
        System.out.println(classroom.getMaxGrade("Computer Science"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("Computer Science"));
        System.out.println(classroom.getWorstGrade("Computer Science"));
        System.out.println(classroom.getGradesPerDiscipline());

        ReportGenerator report = new ReportGenerator("Files/grades.txt", "Files/grade-reports.out");
        report.generateReport();
    }
}