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

		int n = input.nextInt();
		int m = input.nextInt();

		int[][] data = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = input.nextInt();
			}
		}

		int[][] result = new int[n][m];

		divide(data, n, m, 0, result);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(result[i][j] + " ");
			}

			System.out.println();
		}

		input.close();
	}

	int divide(int[][] data, int n, int m, int i, int[][] result) {
		if (i == m * n)
			return 0;

		int a = divide(data, n, m, i + 1, result);

		if (Math.abs(a + data[i / m][i % m]) > Math.abs(a - data[i / m][i % m])) {
			result[i / m][i % m] = 1;
			return a - data[i / m][i % m];
		} else {
			result[i / m][i % m] = 2;
			return a + data[i / m][i % m];
		}
	}
}
