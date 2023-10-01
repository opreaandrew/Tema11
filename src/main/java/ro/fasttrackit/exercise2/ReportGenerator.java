package ro.fasttrackit.exercise2;

import ro.fasttrackit.exercise1.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReportGenerator {
    private final BufferedWriter writer;
    private final Classroom students;

    public ReportGenerator(String readFileLocation, String writeFileLocation) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(writeFileLocation));
        this.students = new Classroom(readFileLocation);
    }

    public void generateReport() throws IOException {
        Map<String, List<Integer>> disciplinesMap = students.getGradesPerDiscipline();
        Set<String> disciplines = disciplinesMap.keySet();
        for (String discipline : disciplines) {
            writer.write(discipline);
            writer.newLine();
            writer.write("Best student: "
                    + students.getMaxGrade(discipline).name()
                    + " "
                    + students.getMaxGrade(discipline).grade());
            writer.newLine();
            writer.write(String.valueOf("Average grade: "
                    + students.getAverageGrade(discipline)));
            writer.newLine();
            writer.write("Worst student: "
                    + students.getWorstGrade(discipline).name()
                    + " "
                    + students.getWorstGrade(discipline).grade());
            writer.newLine();
            writer.newLine();
        }
        writer.close();
    }
}
