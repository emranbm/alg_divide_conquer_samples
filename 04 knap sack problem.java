import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	class Kala {
		int price;
		int weight;

		Kala(int price, int weight) {
			this.weight = weight;
			this.price = price;
		}
	}

	public Main() {
		Scanner input = new Scanner(System.in);

		int maxWeight = input.nextInt();
		int n = input.nextInt();

		Kala[] kalas = new Kala[n];

		for (int i = 0; i < n; i++) {
			kalas[i] = new Kala(input.nextInt(), input.nextInt());
		}

		boolean[] result = new boolean[n];
		knapSack(kalas, maxWeight, 0, result);

		for (int i = 0; i < n; i++) {
			if (result[i])
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		input.close();
	}

	int knapSack(final Kala[] kalas, int cap, int i, boolean[] result) {
		if (cap <= 0)
			return 0;

		int a, b;
		a = 0;
		try {
			if (kalas[i].weight <= cap)
				a = kalas[i].price
						+ knapSack(kalas, cap - kalas[i].weight, i + 1, result);
			b = knapSack(kalas, cap, i + 1, result);
			if (a > b) {
				result[i] = true;
				return a;
			} else {
				result[i] = false;
				return b;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}

	}
}
