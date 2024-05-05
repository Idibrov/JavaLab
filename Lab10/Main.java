import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // 1
    public static List<String> readTextFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    // 2
    public static void writeTextToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3
    public static void mergeTextFiles(String file1Path, String file2Path, String outputPath) {
        List<String> mergedContent = new ArrayList<>();
        mergedContent.addAll(readTextFile(file1Path));
        mergedContent.addAll(readTextFile(file2Path));
        writeTextToFile(outputPath, String.join(System.lineSeparator(), mergedContent));
    }

    // 4
    public static void replaceNonAlphanumeric(String filePath) {
        List<String> lines = readTextFile(filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line.replaceAll("[^\\p{L}0-9]", "\\$") + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String file1Path = "file1.txt";
        String file2Path = "file2.txt";
        String mergedFilePath = "merged.txt";
        String replacedFilePath = "replaced.txt";

        mergeTextFiles(file1Path, file2Path, mergedFilePath);
        replaceNonAlphanumeric(mergedFilePath);
    }
}
