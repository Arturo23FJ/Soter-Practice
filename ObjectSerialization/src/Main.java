import java.io.*;
import java.lang.instrument.Instrumentation;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car b1 = null;
        Car b2 = null;
        Car b3 = null;
        Car[] cars = null;

        FileInputStream inputStream = null;
        try (FileOutputStream outPutStream = new FileOutputStream("carFile.txt")) {
            ObjectOutputStream objOutStream = new ObjectOutputStream(outPutStream);

            Car carWrite1 = new Car("Alfa Romeo", 260, 6);
            Car carWrite2 = new Car("Volkswagen", 210, 8);
            Car carWrite3 = new Car("Mitsubishi", 240, 20);

            objOutStream.writeInt(4);
            objOutStream.writeObject(carWrite1);
            objOutStream.writeObject(carWrite2);
            objOutStream.writeObject(carWrite3);
            objOutStream.writeObject(new Car("Porsche", 290, 12));

            objOutStream.flush();

            inputStream = new FileInputStream("carFile.txt");
            ObjectInputStream objInStream = new ObjectInputStream(inputStream);

            int numberOfObjects = objInStream.readInt();
            cars = new Car[numberOfObjects];
            for (int i = 0; i < numberOfObjects; i++) {
                cars[i] = (Car) objInStream.readObject();
            }


        } catch (FileNotFoundException fe) {

        } catch (ClassNotFoundException ce) {

        }


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}