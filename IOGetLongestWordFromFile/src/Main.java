import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;
        String longestWord = "";
        try(BufferedReader br = new BufferedReader(new FileReader("Heart_of_Darkness.txt"));
            Scanner sc = new Scanner(br)){
            while (sc.hasNext()) {
                word = sc.next();
                if (longestWord.length() < word.length()) {
                    longestWord = word;
                }
            }
        }catch (FileNotFoundException fne){
            System.out.println(fne.getMessage());
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
        System.out.println(longestWord);
    }
}