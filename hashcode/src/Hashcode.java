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
        int[] scores = new int[numberOfBooks];
        List<Library> libraries = new ArrayList<>();
        List<Book> books = new ArrayList<>();

        for (int i = 0; i < numberOfBooks; ++i) {
            books.add(new Book(i, scanner.nextInt()));
        }

        for (int i = 0; i < numberOfLibraries; ++i) {
            libraries.add(new Library(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
            Library currentLibrary = libraries.get(i);
            for (int j = 0; j < currentLibrary.getNumberOfBooks(); ++j) {
                Book book = books.get(scanner.nextInt());
                currentLibrary.addBook(book);
            }
        }
    }
}
