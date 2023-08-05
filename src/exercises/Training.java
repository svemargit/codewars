package src.exercises;

import java.util.ArrayList;
import src.Main;

/**
 * Write a function that takes in a string of one or more words, and returns the same string, but
 * with all five or more letter words reversed (Just like the name of this Kata). Strings passed in
 * will consist of only letters and spaces. Spaces will be included only when more than one word is
 * present.
 *
 * <p>Examples:
 *
 * <p>spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a
 * test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona
 * test"
 */
public class Training extends Main {
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
