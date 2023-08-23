public class Main {
    public static void main(String[] args) {
        System.out.println(reverseText("Qualis artifex pereo!"));
    }

    public static String reverseText(String text){
        String reversedText = "";
        String[] words = text.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedText += words[i] + " ";
        }
        return reversedText;
    }
}