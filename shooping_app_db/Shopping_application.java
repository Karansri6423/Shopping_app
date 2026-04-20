package shooping_app_db;

import java.util.Scanner;

public class Shopping_application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CRUD_operation obj = new CRUD_operation();

		while (true) {

			System.out.println("-----Operations-----");
			System.out.println("1.AddProduct");
			System.out.println("2.getProductByID");
			System.out.println("3.updateProductbyID");
			System.out.println("4.updateProduct");
			System.out.println("5.deleteProduct");
			System.out.println("6.getAllProducts");
			System.out.println("7.Exit");
			System.out.println("Enter your Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.AddProduct(sc);
				break;
			case 2:
				obj.getProductByID(sc);
				break;
			case 3:
				obj.updateProduct(sc);
				break;
			case 4: obj.updateProductbyID(sc);
					break;
			case 5:
				obj.deleteProduct(sc);
				break;
			case 6:
				obj.getAllProducts(sc);
				break;
			case 7:
				System.out.println("Thankyou Come again!!!!");
				System.out.println();
				break;

			}
		}

	}

}
