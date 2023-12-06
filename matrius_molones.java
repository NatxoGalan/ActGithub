import java.util.Scanner;

public class MatricesMolonas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [][]m = {{13 , 7 , 7 , 7},{7, 13, 7 , 7},{7, 7, 13 , 7}, {7, 7, 7 ,13}};


		if (esMolona(m) && esMolona2(m)) {
			System.out.println("Es molona");
		}
		else {
			System.out.println("No es molona");
		}

		sc.close();

	}

	public static boolean esMolona(int[][] m ) {

		boolean esMolona = false;
		int c = 0;
		int d = 0;
		int h = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] == 13) {
					c++;
				}

				if (m[i][j] != 13 && m[i][j] != 7) {
					d++;
					break;
				}
			}
			if (d >= 1) {
				break;

			}

			if (c == 1) {
				h++;
			}

			c = 0;
		}
		if (h == 4) {
			esMolona = true;
		}

		return esMolona;

	}
	public static boolean esMolona2(int[][] m) {

		boolean esMolona = false;
		int c = 0;

		int h = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[j][i] == 13) {
					c++;

				}

			}
			if (c == 1) {
				h ++;
			}

			c = 0;
		}
		if (h == 4) {
			esMolona = true;
		}

		return esMolona;

	}


}
