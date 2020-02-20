import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hashcode {
    public void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(""));
        PrintStream printStream = new PrintStream(new File(""));

        int numberOfBooks = scanner.nextInt();
        int numberOfLibraries = scanner.nextInt();
        int numberOfDays = scanner.nextInt();
        List<Library> libraries = new ArrayList<>();
        int[] scores = new int[numberOfBooks];

        for (int i = 0; i < numberOfBooks; ++i) {
            scores[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfLibraries; ++i) {
            libraries.add(new Library(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
            for (int j = 0; j < libraries.get(i).getNumberOfBooks(); ++j) {

            }
        }
    }
}
