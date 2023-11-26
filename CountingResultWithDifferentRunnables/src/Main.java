/* We would like to get the result with the following formulas which are in different callables
((a + b) / 3) * (8 + c -32) / (a - b + c)
 */

public class Main {
    public static void main(String[] args) {

        double a = 3;
        double b = 6;
        double c = 9;
        System.out.println(FormulaHandler.formulaCounter(a, b, c));
    }
}