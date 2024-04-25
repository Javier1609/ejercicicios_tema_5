package ejercicio_11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ejercicio_11 {
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
            List<String> words = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                words.addAll(Arrays.asList(line.split("\\s+")));
            }
            Collections.sort(words);
            int index = Collections.binarySearch(words, word);
            if (index >= 0) {
                System.out.println("Found word '" + word + "'");
            } else {
                System.out.println("Word '" + word + "' not found");
            }
        }
    }
}