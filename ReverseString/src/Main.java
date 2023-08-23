public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello world!"));
    }

    public static String reverseString(String text){
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }
}