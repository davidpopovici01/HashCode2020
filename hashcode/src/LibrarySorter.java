import java.util.LinkedList;
import java.util.List;

public class LibrarySorter {

  public static Library getBiggestLibrary(List<Library> libraries) {
    int maxLibraryScore = 0;
    int maxLibraryIndex = 0;
    for(int i = 0; i < libraries.size(); i++) {
      int maxScore = 0;
      for(int j = 0; j < libraries.size(); j++) {
        //a is for ordering i first
        int number1a = Main.signupCtr + libraries.get(i).getSignUpDays();
        int number2a = number1a + libraries.get(j).getSignUpDays();

        int score1a = libraries.get(i).calculateScore(Main.numberOfDays - number1a);
        int score2a = libraries.get(j).calculateScore(Main.numberOfDays - number2a);

        int totalscorea = score1a + score2a;

        //b is for ordering j first
        int number1b = Main.signupCtr + libraries.get(j).getSignUpDays();
        int number2b = number1b + libraries.get(i).getSignUpDays();

        int score1b = libraries.get(i).calculateScore(Main.numberOfDays - number1b);
        int score2b = libraries.get(j).calculateScore(Main.numberOfDays - number2b);

        int totalscoreb = score1b + score2b;

        maxScore = Math.max(maxScore, totalscorea - totalscoreb);
      }
      if(maxLibraryScore < maxScore) {
        maxLibraryScore = maxScore;
        maxLibraryIndex = i;
      }
    }

    return libraries.get(maxLibraryIndex); // :)
  }


}
