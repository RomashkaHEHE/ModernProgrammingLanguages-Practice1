import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите A: ");
    double a = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));

    System.out.print("Введите B: ");
    double b = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));

    if (a > b) {
        double temporary = a;
        a = b;
        b = temporary;
    }

    System.out.println("A = " + a);
    System.out.println("B = " + b);
}
