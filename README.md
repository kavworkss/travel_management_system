

# 🧳 Travel and Tourism Management System

Welcome to the **Travel and Tourism Management System**, a Java-based desktop application designed to streamline travel planning. It allows users to explore travel packages, book them, view hotels, manage user accounts, and store/retrieve data using a SQL database.

---

## 📸 Screenshots 

- Login Page
- ![image](https://github.com/user-attachments/assets/8d6b0199-a125-4edc-a5d4-d5cdcaa65d8b)

- 
- Dashboard
- ![image](https://github.com/user-attachments/assets/0b36fe26-3a28-4145-9fa5-8e168e6acbc8)

- View Packages
- ![image](https://github.com/user-attachments/assets/a1580cac-d18e-4fd1-84c0-dc6204e0950c)

- Book Packages
- ![image](https://github.com/user-attachments/assets/0cd7bed0-79f3-40cf-b0b0-fa5bbdc44ee4)

- 
- Signup / User Info Page
- ![image](https://github.com/user-attachments/assets/adf6c804-f1eb-4dbd-9fb8-843ec2009011)
- ![image](https://github.com/user-attachments/assets/31e13b1e-a948-460f-9dd9-2ceef8d2113a)



---

## 🛠 Tech Stack

- **Java (Swing + AWT)** — For building the GUI
- **MySQL** — Relational database to store all data
- **JDBC** — Java Database Connectivity to link the app and the database
- **IDE** — Eclipse / IntelliJ / NetBeans (any Java IDE works)

---

## 🔐 Core Features

### 👤 User Authentication
- **Login** using existing username and password
- **Signup/Register** as a new user
- All user data is stored and validated using the **MySQL database**

### 🧭 Dashboard
Once logged in, users are redirected to a **Dashboard** which provides access to:
- Book Packages
- View Booked Packages
- View Hotels
- Book Hotels
- View Booked Hotels
- View User Info
- Payment/Price Calculation
- Logout

### 📦 Book Package
- Choose from **Gold**, **Silver**, or **Bronze** package
- Enter number of persons
- Calculate **total cost**
- Book the package and save the data to the database
- View booked package later


### 🧾 User Info
- Displays the user's personal info retrieved from the database
- Fields include: ID, phone, email, gender, etc.

### 📥 Data Management
- All bookings (hotels, packages) and user data are stored in **MySQL database** using JDBC

---

## 🧱 Project Structure

```
travel.management.system/
│
├── BookPackage.java         # Book travel packages
├── BookHotel.java           # Book hotels
├── ViewHotels.java          # Display hotel info
├── ViewPackage.java         # Display available packages
├── ViewBookedHotel.java     # Display user’s booked hotels
├── ViewBookedPackage.java   # Display user’s booked packages
├── Signup.java              # User registration form
├── Login.java               # User login form
├── Dashboard.java           # Central screen after login
├── conn.java                # MySQL database connection setup
├── Loading.java             # Loading screen with progress bar
├── AddCustomer.java         # Add user info to the system
├── icons/                   # Images used in GUI (JLabel icons)
```

---

## 🧠 Architecture Overview

### MVC Pattern (Lightweight)
- **Model**: Database (`MySQL`) stores user, booking, and hotel data.
- **View**: Java Swing/AWT GUI components (buttons, labels, forms).
- **Controller**: ActionListeners in Java classes control user interaction and logic.

### Database Design
- **Tables**:
  - `customer` — stores user details
  - `account` — stores login credentials
  - `bookPackage` — stores package bookings
  - `bookHotel` — stores hotel bookings

---

Sure! Here's the **combined and polished** version of your **🌱 Future Enhancements** section for the `README.md`, integrating the table with the additional text in a clean and professional format:

---

## 🌱 Future Enhancements

| Feature | Description |
|--------|-------------|
| 🌍 Online Payments | Integrate with Razorpay or PayPal API for real-time payments. |
| 📱 Mobile App | Build a cross-platform mobile version using JavaFX or Flutter. |
| 🗺️ Google Maps Integration | Display hotel and package locations using Google Maps API. |
| 💬 Chat Support | Add chatbot or live support using Dialogflow or custom logic. |
| 📧 Email Notifications | Send booking confirmations and alerts via JavaMail API. |
| 📊 Admin Panel | Develop an admin dashboard to manage users, bookings, and packages. |
| 🌐 Cloud Database | Migrate from local MySQL to cloud databases like Firebase or AWS RDS. |
| 📦 Package Recommendation | Use AI/ML to suggest travel packages based on user history. |
| 🧾 Invoice Generation | Automatically generate PDF invoices upon successful booking. |

### Additional Planned Features
- **Hotel Viewing & Booking** – Implement functionality to browse available hotels and make reservations.
- **UI/UX Enhancements & New Modules** – Add feedback system, travel history tracking, responsive design, and smoother user experience.

---

## 🚀 Getting Started

### Prerequisites:
- Java JDK 8+
- MySQL Server (XAMPP / WAMP / Localhost)
- MySQL Workbench (optional for DB view)
- Java IDE (Eclipse / IntelliJ)

### Setup Instructions:
1. Clone this repo:
   ```bash
   git clone https://github.com/yourusername/travel_management_system.git
   cd travel-management-system
   ```

2. Set up the MySQL database:
   - Create a database `travel`
   - Import the SQL tables (you can manually insert data or create a `travel.sql` file)

3. Update `conn.java` with your MySQL credentials:
   ```java
   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel", "root", "password");
   ```

4. Run `Login.java` to get started.

---

## 🙌 Contribution

Found a bug or have suggestions? Feel free to fork the repo, open issues, or send PRs!

---

## 📄 License

This project is for educational purposes and currently has no license.

