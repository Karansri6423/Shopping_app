# 🛒 Shopping Application (JDBC - Java)

## 📌 Overview

This is a **Java-based Shopping Application** that performs **CRUD operations using JDBC (Java Database Connectivity)** with a MySQL database.

The system allows users to manage products such as:

* Adding new products
* Viewing product details
* Updating product information
* Deleting products

This project demonstrates how Java applications interact with databases using **PreparedStatement and ResultSet**.

---

## 🚀 Features

### 📦 Product Management

* ➕ Add new product
* 🔍 Get product by ID
* 📋 View all products
* ✏️ Update product:

  * By ID
  * By Name
* ❌ Delete product

---

## 🛠️ Technologies Used

* **Language:** Java
* **Database:** MySQL
* **Connectivity:** JDBC
* **Concepts Used:**

  * OOP (Encapsulation, Classes & Objects)
  * Collections (`ArrayList`)
  * Exception Handling

---

## 📂 Project Structure

```id="struct1"
shooping_app_db/
│
├── Shopping_application.java   # Main class (menu-driven program)
├── CRUD_operation.java        # Handles all database operations
├── product_id.java            # Product model class
```

---

## ⚙️ Database Configuration

### 📌 Database Name:

```sql id="db1"
shopping_db
```

### 📌 Table Structure:

```sql id="db2"
CREATE TABLE product (
    pid INT PRIMARY KEY,
    name VARCHAR(50),
    quantity INT,
    price DOUBLE
);
```

---

## 🔌 JDBC Configuration

```java id="jdbc1"
String url = "jdbc:mysql://localhost:3306/shopping_db";
String user = "root";
String password = "your_password";
```

---

## ▶️ How to Run

### 1. Clone Repository

```bash id="clone1"
git clone https://github.com/Karansri6423/Shopping_app.git
```

### 2. Setup MySQL Database

* Create database and table (given above)

### 3. Add JDBC Driver

* Add **MySQL Connector JAR** to project

### 4. Run Application

```id="run1"
Shopping_application.java
```

---

## 🔄 Application Workflow

```id="flow1"
1. Add Product
2. Get Product By ID
3. Update Product By ID
4. Update Product By Name
5. Delete Product
6. Get All Products
7. Exit
```

---

## 📸 Sample Output

```id="output1"
-----Operations-----
1.AddProduct
2.getProductByID
3.updateProductbyID
4.updateProduct
5.deleteProduct
6.getAllProducts
7.Exit
Enter your Choice:
```

---

## ⚠️ Important Notes

* Make sure **MySQL server is running**
* Update your database password in code
* Product ID must be unique
* Uses **PreparedStatement** to prevent SQL injection

---

## 💡 Future Enhancements

* ✅ Add user login system
* ✅ Implement shopping cart
* ✅ Add order & billing system
* ✅ GUI using JavaFX / Swing
* ✅ REST API integration

---

## 🤝 Contribution

Feel free to fork this repository and improve it.

---

## 📜 License

This project is for educational purposes only.

---

## 🙌 Author

**Karan Khabale**
