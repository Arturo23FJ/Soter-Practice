import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(39, 55, 23, 8, 1, 4));
        ArrayList<Integer> numbersFromTextFile = new ArrayList<>();
        FileInputStream inputStream;
        try (FileOutputStream outPutStream = new FileOutputStream("numbers.txt")) {
            ObjectOutputStream objOutStream = new ObjectOutputStream(outPutStream);

            objOutStream.writeObject(numbers);
            objOutStream.flush();

            inputStream = new FileInputStream("numbers.txt");
            ObjectInputStream objInStream = new ObjectInputStream(inputStream);

            numbersFromTextFile = (ArrayList<Integer>) objInStream.readObject();

        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }catch (IOException ioe){
            System.out.println("Error message: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
        }

        System.out.print("Reading from file: ");
        System.out.println(numbersFromTextFile);

        System.out.println("Sum of the elements in the arraylist: " + sumArrayListElements(numbersFromTextFile));
    }

    public static int sumArrayListElements(ArrayList<Integer> list){
        int sum = 0;

        for(Integer element : list){
            sum += element;
        }
        return sum;
    }
}