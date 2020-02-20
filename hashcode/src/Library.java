import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
  private int numberOfBooks;
  private int signUpDays;
  private int booksPerDay;
  public List<Book> books;

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
  }

  public void addBook(Book book) {
    books.add(book);
  }
}
