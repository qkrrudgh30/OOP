package academy.codechosun.exception;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PrintLine {
    public void printLines(String relativePath) {
        Path path = Paths.get(getClassPath(), relativePath);

        List<String> lines;
        try {
            lines = Files.readAllLines(path);
            System.out.format("%d lines read.%s", lines.size(), System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }

        for (String line : lines) {
            System.out.println(line);
        }

    }

}
