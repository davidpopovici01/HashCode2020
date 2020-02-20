import java.util.ArrayList;

public class Library {
  private int numberOfBooks;
  private int signUpDays;
  private int booksPerDay;

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

  private ArrayList<Integer> books;

  public Library(int numberOfBooks, int signUpDays, int booksPerDay, ArrayList<Integer> books) {
    this.numberOfBooks = numberOfBooks;
    this.signUpDays = signUpDays;
    this.booksPerDay = booksPerDay;
    this.books = books;
  }

}
