package src.exercises;

import java.util.ArrayList;
import src.Main;

public class Training extends Main {
  /**
   * You probably know the "like" system from Facebook and other pages. People can "like" blog
   * posts, pictures or other items. We want to create the text that should be displayed next to
   * such an item.
   *
   * <p>Implement the function which takes an array containing the names of people that like an
   * item. It must return the display text as shown in the examples:
   *
   * <p>[] --> "no one likes this" ["Peter"] --> "Peter likes this" ["Jacob", "Alex"] --> "Jacob and
   * Alex like this" ["Max", "John", "Mark"] --> "Max, John and Mark like this" ["Alex", "Jacob",
   * "Mark", "Max"] --> "Alex, Jacob and 2 others like this" Note: For 4 or more names, the number
   * in "and 2 others" simply increases.
   */
  public static String whoLikesIt(String... names) {
    // Do your magic here
    return "";
  }

  /**
   * Write a function that takes in a string of one or more words, and returns the same string, but
   * with all five or more letter words reversed (Just like the name of this Kata). Strings passed
   * in will consist of only letters and spaces. Spaces will be included only when more than one
   * word is present.
   *
   * <p>Examples:
   *
   * <p>spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a
   * test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is
   * rehtona test"
   */
  public String spinWords(String sentence) {
    StringBuilder spunSentence = new StringBuilder();
    long spaceCount = sentence.chars().filter(c -> c == (int) ' ').count();
    String word;
    for (int i = 0; i <= spaceCount; i++) {
      word = sentence.split(" ")[i];
      if (word.length() >= 5) {
        ArrayList<String> letters = new ArrayList<>();
        StringBuilder spunWord = new StringBuilder();
        for (int x = 0; x < word.length(); x++) {
          letters.add(String.valueOf(word.charAt(x)));
        }
        for (int y = word.length() - 1; y >= 0; y--) {
          spunWord.append(letters.get(y));
          word = spunWord.toString();
        }
      }
      spunSentence.append(word);
      if (i != spaceCount) {
        spunSentence.append(" ");
      }
    }
    return spunSentence.toString();
  }
}
