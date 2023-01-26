import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleScorer {
    private String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int[] values = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    private ArrayList<ArrayList<String>> dictionary;

    public ScrabbleScorer(){
        dictionary = new ArrayList<>();
        for(int i = 0; i < 26; i++)
            dictionary.add(new ArrayList<String>());
    }

    public void buildDictionary(){
        try{
            Scanner in = new Scanner(new File("SCRABBLEWORDS.txt"));
            while(in.hasNext()){

            }
            in.close();
        }
        catch(Exception e){
            System.out.println("Error here: " + e);
        }
    }

    public boolean isValidWord(String word){
        return true;
    }

    public int getWordScore(String word){
        int score = 0;
        for(int i = 0; i < word.length(); i++){
            int index = alpha.indexOf(word.substring(i, i+1));
            score += values[index];
        }
        return score;
    }

    public static void main(String[] args){
        ScrabbleScorer app = new ScrabbleScorer();

    }
}
