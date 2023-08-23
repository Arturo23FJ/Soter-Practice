public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Yo, banana boy!"));
        System.out.println(isPalindrome("Hello world!"));
    }

    public static boolean isPalindrome(String text) {
        String modified = "";
        String reversed = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' &&
                    text.charAt(i) != '.' &&
                    text.charAt(i) != ',' &&
                    text.charAt(i) != '!' &&
                    text.charAt(i) != '?') {
                modified += text.charAt(i);
            }
        }

        for (int i = modified.length() - 1; i >= 0; i--) {
            reversed += modified.charAt(i);
        }

        return modified.equalsIgnoreCase(reversed);
    }
}