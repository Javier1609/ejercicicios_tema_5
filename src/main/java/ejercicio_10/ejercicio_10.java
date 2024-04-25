package ejercicio_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path:");
        String filePath = scanner.nextLine();
        System.out.println("Enter the word to search:");
        String word = scanner.nextLine();
        try {
            searchWordInFile(filePath, word);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void searchWordInFile(String filePath, String word) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        System.out.println("Found word '" + word + "' in line " + lineNumber + ": " + line);
                    }
                }
                lineNumber++;
            }
        }
    }
}