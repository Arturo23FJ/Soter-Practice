import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("text.txt");
            FileWriter fw = new FileWriter("text2.txt")){
            int character;
            int characterCount = 0;             //Variable to get each character from the text file

            while ((character = fr.read()) != -1){
                if((characterCount % 2) == 0) {          //Getting every second character with the remainder operator
                    fw.write((char)character);          //Converting the type int character to char and writing it to another text file
                } else if(character == '\n'){
                    fw.write(System.lineSeparator());   //Adding line separators in case there are multiple lines in our text file
                }
                ++characterCount;   //Incrementing the character count to get the next one
            }
        }catch (FileNotFoundException fne){
            System.out.println(fne.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}