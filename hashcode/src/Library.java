import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
  private int numberOfBooks;
  private int signUpDays;
  private int booksPerDay;
  private List<Book> books;

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

  public Library(int numberOfBooks, int signUpDays, int booksPerDay) {
    this.numberOfBooks = numberOfBooks;
    this.signUpDays = signUpDays;
    this.booksPerDay = booksPerDay;
    books = new ArrayList<>();
    Collections.sort(books);
  }

  public void addBook(Book book) {
    books.add(book);
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
}
