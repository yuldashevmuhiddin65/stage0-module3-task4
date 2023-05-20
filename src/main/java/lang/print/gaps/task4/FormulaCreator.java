package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        Double result;
        double a = 2;
        double b = 5;

        result = (9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        System.out.println(result);
    }
}
