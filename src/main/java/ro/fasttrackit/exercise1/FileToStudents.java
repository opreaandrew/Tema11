package ro.fasttrackit.exercise1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileToStudents {
    private final String fileLocation;

    public FileToStudents(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public List<StudentGrade> readStudentGrades() throws IOException {
        Scanner scanner = new Scanner(Path.of(this.fileLocation));
        List<StudentGrade> students = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] pieces = line.split("[|]");
            if (pieces[0] == null || pieces[1] == null || pieces[2] == null) {
                continue;
            }
            students.add(new StudentGrade(pieces[0], pieces[1], Integer.valueOf(pieces[2])));
        }
    return students;
    }
}