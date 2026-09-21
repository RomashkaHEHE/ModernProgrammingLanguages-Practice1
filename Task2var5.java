import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите x (в радианах): ");
    double x = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));

    double y = Math.pow(Math.cos(x), 3)
            - Math.sin(2 * x)
            + 1 / Math.tan(x);

    System.out.println("y = " + y);
}
