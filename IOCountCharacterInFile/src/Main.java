import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("tgtbtu.txt")){
            int currentCharacter;
            int countCharacter = 0;

            while ((currentCharacter = fr.read()) != -1){
                if(currentCharacter == ','){
                    countCharacter++;
                }
            }
            System.out.println("We have " + countCharacter + " pieces of the ' , ' character");
        }catch (FileNotFoundException fne){
            System.out.println(fne.getMessage());
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}