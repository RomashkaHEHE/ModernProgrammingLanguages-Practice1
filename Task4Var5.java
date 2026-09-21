import java.text.DecimalFormat;
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("считает длинну гиппотенузы по пифагору");

    System.out.print("длинна катета а: ");
    String inputA = scanner.nextLine().trim().replace(',', '.');
    System.out.print("длинна катета b: ");
    String inputB = scanner.nextLine().trim().replace(',', '.');

    double a;
    double b;
    try {
        a = Double.parseDouble(inputA);
        b = Double.parseDouble(inputB);
    } catch (NumberFormatException e) {
        System.out.println("введено не число");
        return;
    }

    if (!Double.isFinite(a) || !Double.isFinite(b) || a <= 0 || b <= 0) {
        System.out.println("допустимы только положительные числа");
        return;
    }

    double c = Math.sqrt(a * a + b * b);

    DecimalFormat format = new DecimalFormat("0.####");

    System.out.println();
    System.out.println("катет a = " + format.format(a));
    System.out.println("катет b = " + format.format(b));
    System.out.println("гипотенуза c = " + format.format(c));
}
