import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> words = new Stack<>();
        try(BufferedReader br = new BufferedReader(new FileReader("seneca.txt"));
            Scanner scanner = new Scanner(br)){

            while (scanner.hasNext()){
                words.push(scanner.next());
            }
        }catch (FileNotFoundException fne){
            System.out.println(fne.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

        while (!words.isEmpty()){
            System.out.println(words.pop());
        }
    }
}