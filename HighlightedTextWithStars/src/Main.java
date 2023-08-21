public class Main {
    public static void main(String[] args) {
        highlightedText("Viva Las Vegas");
    }

    public static void highlightedText(String text){
        int numberOfStars = text.length() + 4;
        String firstAndLastLine = "";
        for (int i = 0; i < numberOfStars; i++) {
            firstAndLastLine += "*";
        }
        System.out.println(firstAndLastLine);
        System.out.println("* " + text + " *");
        System.out.println(firstAndLastLine);
    }
}