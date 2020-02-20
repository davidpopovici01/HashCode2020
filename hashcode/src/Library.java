import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
  private int numberOfBooks;
  private int signUpDays;
  private int booksPerDay;
  private List<Book> books;
  private int signUpDay;
  private int index;

  public int getNumberOfBooks() {
    return numberOfBooks;
  }

  public int getSignUpDays() {
    return signUpDays;
  }

  public int getBooksPerDay() {
    return booksPerDay;
  }

  public List<Book> getBooks() {
    return books;
  }

  public Library(int numberOfBooks, int signUpDays, int booksPerDay, int index) {
    this.numberOfBooks = numberOfBooks;
    this.signUpDays = signUpDays;
    this.booksPerDay = booksPerDay;
    this.index = index;
    books = new ArrayList<>();
    Collections.sort(books);
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public int getIndex() {
    return index;
  }

  public int calculateScore(int no) {
    int sum = 0;
    if (no == 0) {
      return 0;
    }
    if (no > numberOfBooks) {
      no = numberOfBooks;
    }
    for (int i = 0; i < no; i++) {
      sum += books.get(i).getScore();
    }
    return sum;
  }

  public int getNumberOfBooksScanned() {
    return numberOfBooks * Integer.max(signUpDays, Main.numberOfDays - signUpDay);
  }

  public List<Book> getBooksScanned() {
    List<Book> booksScanned = new ArrayList<>();
    int numberOfBooksScanned = getNumberOfBooksScanned();
    for (int i = 0; i < numberOfBooksScanned; ++i) {
      booksScanned.add(books.get(i));
    }
    return booksScanned;
  }
}
