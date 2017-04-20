import java.io.DataInputStream;

public class Palindrom {

	public static void main(String s[]) throws Exception {

		DataInputStream var = new DataInputStream(System.in);

		int i, num1, num2, temp, rem, sum;

		System.out.println("Wpisz  liczbe początkową:");
		num1 = Integer.parseInt(var.readLine());

		System.out.println("Wpisz  liczbe końcową:");
		num2 = Integer.parseInt(var.readLine());

		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		System.out.println("Wszystkie Palindromy między liczbą " + num1 + " a " + num2 + " to:");

		for (i = num1; i <= num2; i++) {
			sum = 0;
			temp = i;

			while (temp > 0) {

				rem = temp % 10;
				temp = temp / 10;
				sum = (sum * 10) + rem;
			}

			if (i == sum) {
				System.out.println(+i);
			}
		}

	}
}