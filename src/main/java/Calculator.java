import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operations op = new Operations();
		while (true) {
			System.out.println("\n1. Sum");
			System.out.println("2. Substract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			System.out.println("Enter your choice :");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter two numbers :");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("Sum :" + op.summation(a, b));
				break;
			case 2:
				System.out.println("Enter two numbers :");
				double c = sc.nextDouble();
				double d = sc.nextDouble();
				System.out.println("Substract :" + op.substraction(c, d));
				break;
			case 3:
				System.out.println("Enter two numbers :");
				double e = sc.nextDouble();
				int f = sc.nextInt();
				System.out.println("Multiply :" + op.multiplication(e, f));
				break;
			case 4:
				System.out.println("Enter two numbers :");
				int g = sc.nextInt();
				double h = sc.nextDouble();
				System.out.println("Sum :" + op.division(g, h));
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Wrong choice!");
			}
		}
	}
}