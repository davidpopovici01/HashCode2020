public class Book implements Comparable<Book> {
  private int index;
  private int score;

  public int getIndex() {
    return index;
  }

  public int getScore() {
    return score;
  }

  public Book(int index, int score) {
    this.index = index;
    this.score = score;
  }

  @Override
  public int compareTo(Book book) {
    if (this.score < book.score) {
      return 1;
    } else if (this.score > book.score) {
      return -1;
    }
    return 0;
  }


}
