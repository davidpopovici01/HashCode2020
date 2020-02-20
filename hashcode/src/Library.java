import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
  private int numberOfBooks;
  private int signUpDays;
  private int booksPerDay;
  private ArrayList<Book> books;

  public int getNumberOfBooks() {
    return numberOfBooks;
  }

  public int getSignUpDays() {
    return signUpDays;
  }

  public int getBooksPerDay() {
    return booksPerDay;
  }

  public ArrayList<Integer> getBooks() {
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
