

	import java.util.Random;
	import java.util.Scanner;

	/* Online Java Compiler and Editor */
	public class Main {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Nhap vao ten file: ");

			String str = scan.nextLine();
			int dem = 0;
			for (int i = 0; i < str.length() - 1; i++) {
				for (int j = i + 1; j < str.length(); j++) {
					String str2 = str.substring(i, j);
					if (str2.equals("."))
						dem++;
				}

			}
			if (dem > 1)
				System.out.println("nhap lai chuoi");
			else {
				int str2 = str.indexOf(".");

				String str3 = str.substring(str2, str.length());
				System.out.println(str3);
			}

		}

	}

