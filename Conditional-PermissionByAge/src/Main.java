import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        whatYouAreAllowedAtYourAge();
    }

    public static void whatYouAreAllowedAtYourAge(){
        System.out.println("Please enter your age!");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age >= 13)
            System.out.println("You can have a Facebook account");

        if(age >= 16)
            System.out.println("You can have a driving license");

        if(age >= 18)
            System.out.println("You can have a tattoo");

        if (age >= 21)
            System.out.println("You can drink alcohol");

        if (age >= 35)
            System.out.println("You can run for presidential election");

    }
}