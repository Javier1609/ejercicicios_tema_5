package ejercicio_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio_9 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileSorter <input file> <output file>");
            return;
        }

        Path inputFile = Paths.get(args[0]);
        Path outputFile = Paths.get(args[1]);

        if (!Files.exists(inputFile)) {
            System.out.println("Error: Input file does not exist: " + inputFile);
            return;
        }

        try {
            // Read all lines from the file into a list
            List<String> lines = Files.readAllLines(inputFile);

            // Sort the list of lines alphabetically
            List<String> sortedLines = lines.stream()
                    .sorted()
                    .collect(Collectors.toList());

            // Write the sorted lines to a new file
            Files.write(outputFile, sortedLines);
            System.out.println("Sorted file written to: " + outputFile);
        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        }
    }
}