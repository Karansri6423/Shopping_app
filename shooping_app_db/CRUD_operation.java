package shooping_app_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD_operation {

	static String url = "jdbc:mysql://localhost:3306/shopping_db";
	static String user = "root";
	static String Pass = "Karansri@6423";
	List<product_id> p = new ArrayList<>();

	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, user, Pass);
	}

	public void AddProduct(Scanner sc) {
		try (Connection con = getConnection()) {
			System.out.println("Enter the Product Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter the product name: ");
			String name = sc.nextLine();

			System.out.println("Enter the product quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter the product price: ");
			double price = sc.nextDouble();

			PreparedStatement ps = con.prepareStatement("INSERT INTO product VALUES(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, quantity);
			ps.setDouble(4, price);

			int rows = ps.executeUpdate();
			System.out.println(rows + " INSERTED SUCCESSFULLY");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getProductByID(Scanner sc) {

		try (Connection con = getConnection()) {
			System.out.println("Enter the product id: ");
			int id = sc.nextInt();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM product WHERE pid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int a = rs.getInt(1);

				String b = rs.getString(2);

				int c = rs.getInt(3);
				double d = rs.getDouble(4);

				product_id pi = new product_id(a, b, c, d);

				p.add(pi);
				System.out.println(pi);
				System.out.println();

//					
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void updateProductbyID(Scanner sc)// product
	{
		try (Connection con = getConnection()) {

			sc.nextLine();
			System.out.println("enter the upadte Product name: ");
			String new_name = sc.nextLine();
			

			System.out.println("Enter the product Id to be changed: ");
			int id = sc.nextInt();

			PreparedStatement ps = con.prepareStatement("UPDATE product SET name=? WHERE id=?");
			ps.setString(1, new_name);
			ps.setInt(2, id);

			int rows = ps.executeUpdate();

			System.out.println(rows + " UPDATED Successfully!!!!");
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateProduct(Scanner sc)// product
	{
		try (Connection con = getConnection()) {

			sc.nextLine();
			System.out.println("enter the upadte Product name: ");
			String new_name = sc.nextLine();
			

			System.out.println("Enter the product name to be changed: ");
			String old_name = sc.nextLine();

			PreparedStatement ps = con.prepareStatement("UPDATE product SET name=? WHERE name=?");
			ps.setString(1, new_name);
			ps.setString(2, old_name);

			int rows = ps.executeUpdate();

			System.out.println(rows + " UPDATED Successfully!!!!");
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteProduct(Scanner sc) {
		try (Connection con = getConnection()) {
			System.out.println("Enter the product id: ");
			int id = sc.nextInt();

			PreparedStatement ps = con.prepareStatement("DELETE FROM product WHERE pid=?");
			ps.setInt(1, id);

			int rows = ps.executeUpdate();

			System.out.println(rows + " DELETED Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getAllProducts(Scanner sc) {
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM product");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int a = rs.getInt(1);

				String b = rs.getString(2);

				int c = rs.getInt(3);
				double d = rs.getDouble(4);

				product_id pi = new product_id(a, b, c, d);

				p.add(pi);
				System.out.println(pi);
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
