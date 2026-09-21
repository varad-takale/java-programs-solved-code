# java-programs-solved-code


# program 1 -📌 Pattern Output

A simple Java program that demonstrates how to print a **decreasing star (`*`) pattern** using `System.out.println()`.

This project is designed for beginners who are learning the fundamentals of **Java programming, classes, methods, and console output**.



```text
****
***
**
*
```

## 💻 Source Code

```java
public class pattern {
    public static void main(String[] args) {
        System.out.println("****\n***\n**\n*");

        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
    }
}

Computer Engineering Graduate
Interested in Java, Spring Boot, SQL, and Software Development.

```

# Program 2 – Addition

##📌 Description

This is a simple Java program that demonstrates **addition of two integer numbers**.

The program initializes two integer variables, calculates their sum, and displays the result on the console.

## 🛠️ Technologies Used

* Java
* `int` data type
* Arithmetic addition operator (`+`)
* `System.out.println()`

## 💻 Program Logic

The program performs the following steps:

1. Creates an integer variable `a` with the value `15`.
2. Creates an integer variable `b` with the value `10`.
3. Adds `a` and `b`.
4. Stores the result in the `sum` variable.
5. Prints the result to the console.


```

## ▶️ Output

```text
25
```
# program 3 - Circle Area Calculator in Java

## 📌 Overview

This is a simple Java program that calculates the **area of a circle** based on the radius provided by the user.

The program takes a radius as input using the `Scanner` class and applies the formula:

**Area = π × radius²**

The program uses `3.14` as the value of π.

## 🛠️ Technologies Used

* Java
* `Scanner` class
* Basic arithmetic operations
* User input


```

## ⚙️ How It Works

1. The program imports `java.util.*`.
2. A `Scanner` object is created to take input from the user.
3. The user enters the radius of the circle.
4. The program calculates the area using:

```text
Area = 3.14 × radius × radius
```

5. The calculated area is displayed on the screen.


```

## ▶️ How to Run

### 1. Compile the program

```bash
javac radius.java
```

### 2. Run the program

```bash
java radius
```

### 3. Enter the radius

For example:

```text
5
```

### Output

```text
78.5
```

## 📐 Formula

```text
Area = πr²
```

Where:

* `r` = radius
* `π` = 3.14

## 🎯 Learning Objectives

This project demonstrates basic Java concepts such as:

* Taking input using `Scanner`
* Declaring variables
* Using the `float` data type
* Performing arithmetic calculations
* Printing output using `System.out.println()`
  
 ```
```

  # program 4 - Java Character to Integer Conversion

A simple Java program that demonstrates how a `char` value can be converted into its corresponding integer value.

## 📌 About the Program

This program declares several character variables and converts each character into an integer using Java's implicit type conversion.

The characters used in the program are:

```text
v
a
r
a
d
```

Each character is assigned to an `int` variable, and the resulting integer values are printed to the console.



```

## 🧠 Concept Used

### Character to Integer Conversion

In Java, a `char` can be assigned directly to an `int`.

```java
char ch = 'v';
int number = ch;
```

Java converts the character into its corresponding Unicode numeric value.

For example:

```text
Character    Integer Value
v            118
a            97
r            114
a            97
d            100
```

## 📤 Expected Output

```text
118
97
114
97
100
```

## 🛠️ Technologies Used

* **Java**
* Java Primitive Data Types
* Character (`char`)
* Integer (`int`)
* Type Conversion

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/your-repository-name.git
```

### 2. Navigate to the project directory

```bash
cd your-repository-name
```

### 3. Compile the Java program

```bash
javac charect.java
```
# program 5 - Adult Age Checker – Java

A simple Java program that checks whether a person is an **adult** based on their age.

## 📌 About the Project

This project demonstrates the basic use of:

* Java `if-else` statements
* Integer variables
* Comparison operators
* Console output using `System.out.println()`

The program uses an age value and checks whether it is **18 or above**. If the condition is true, it displays that the person is an adult.

## 🛠️ Technologies Used

* **Java**
* Java Development Kit (JDK)

## 💻 How It Works

The program:

1. Stores the person's age in an integer variable.
2. Checks whether the age is greater than or equal to `18`.
3. If the condition is true, it prints:
   `adult : vote, drive`
4. Otherwise, it prints:
   `not adult`

## ▶️ Example

### Input

```text
Age = 23
```

### Output

```text
adult : vote, drive
```

## 🚀 How to Run

1. Install Java JDK.
2. Clone this repository:

```bash
git clone https://github.com/your-username/your-repository-name.git
```

3. Open the project folder.
4. Compile the Java program:

```bash
javac adult.java
```

5. Run the program:

```bash
java adult
```

# program 6 - # 🔢 Largest of Two Numbers in Java

A simple Java program that compares two integer values and determines which number is larger using an `if-else` statement.

## 📌 Project Overview

This beginner-friendly Java program demonstrates how to:

* Declare and initialize integer variables.
* Compare two numbers using the `>=` operator.
* Use an `if-else` conditional statement.
* Display the result using `System.out.println()`.

The program uses the values `10` and `15` and determines which one is the largest.

## 🛠️ Technologies Used

* **Java**
* **if-else statement**
* **Comparison operators**
* **Console output**



## ▶️ How to Run

### 1. Check Java Installation

Make sure Java is installed on your computer:

```bash
java -version
```

### 2. Compile the Program

Open a terminal in the folder containing the Java file and run:

```bash
javac largest.java
```

### 3. Run the Program

```bash
java largest
```

## 📤 Output

For the values:

```text
a = 10
b = 15
```

The program produces:

```text
b is largest of 2
```

## 🧠 Concepts Covered

| Concept                | Description                                                  |
| ---------------------- | ------------------------------------------------------------ |
| `int`                  | Stores integer values                                        |
| `if-else`              | Makes a decision based on a condition                        |
| `>=`                   | Checks whether one value is greater than or equal to another |
| `System.out.println()` | Prints output to the console                                 |

## 📁 Project Structure

```text
Largest-Number-Java/
│
├── largest.java
└── README.md
```

## 🚀 Possible Improvements

This program can be extended to:

* Take numbers from the user using `Scanner`.
* Find the largest among three numbers.
* Find the largest number in an array.
* Create a reusable method for finding the largest number.

# program 7 -  🔢 Even or Odd Checker — Java

A simple Java program that checks whether a given number is **even or odd** using the modulo (`%`) operator.

## 📌 About the Project

This project demonstrates a basic Java conditional statement and the use of the modulo operator.

The program currently checks the value `14` and prints whether the number is even or odd. The code also contains commented-out `Scanner` input code, which can be used to accept a number from the user.

## 🛠️ Technologies Used

* **Java**
* **Java Scanner** *(prepared for user input)*

## 🧠 How It Works

The program uses the modulo operator:

```java
number % 2
```

* If the remainder is `0`, the number is **even**.
* Otherwise, the number is **odd**.

For example:

```text
14 % 2 = 0
```

Therefore, `14` is an even number.


```

## ▶️ Output

For the current value `14`, the output is:

```text
14 : number is even
```

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/even-odd-java.git
```

### 2. Navigate to the project

```bash
cd even-odd-java
```

### 3. Compile the program

```bash
javac evenodd.java
```

### 4. Run the program

```bash
java evenodd
```

## 📂 Project Structure

```text
even-odd-java/
│
├── evenodd.java
└── README.md
```

## 🔄 Future Improvement

The program can be modified to take the number dynamically from the user by uncommenting the `Scanner` input lines:

```java
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
```

This would allow the user to check any number without changing the source code.

## 🎯 Concepts Practiced

* Java class and `main()` method
* `Scanner` for user input
* Variables
* Modulo (`%`) operator
* `if-else` conditional statements
* Console output using `System.out.println()`


# program 8 - # 💰 Tax Calculator — Java

A simple Java console-based program that calculates tax based on a person's income using conditional statements.

## 📌 About the Project

This project demonstrates how **`if-else if-else` conditional statements** can be used in Java to apply different tax rates according to income ranges.

The program currently uses a fixed income value and calculates the corresponding tax amount.

## 🚀 Features

* Calculates tax based on income.
* Uses `if-else if-else` conditions.
* Demonstrates percentage-based calculations.
* Displays the calculated tax in the console.
* Beginner-friendly Java project.

## 🧠 Tax Logic Used

The program applies the following rules:

| Income Range          | Tax Rate |
| --------------------- | -------: |
| Below ₹5,00,000       |       0% |
| ₹5,00,000 – ₹9,99,999 |      20% |
| ₹10,00,000 and above  |      30% |

> **Note:** These tax brackets are the rules implemented in this learning project and are not intended to represent current real-world tax regulations.

## 💻 Example

The program currently uses:

```java
int income = 400000;
```

Since the income is below ₹5,00,000, the program calculates:

```text
tax is 0
```

## 🛠️ Technologies Used

* **Java**
* `if-else if-else`
* Arithmetic operators
* Console output

## 📂 Project Structure

```text
Tax-Calculator/
│
├── taxcal.java
└── README.md
```

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Tax-Calculator.git
```

### 2. Navigate to the Project Folder

```bash
cd Tax-Calculator
```

### 3. Compile the Java Program

```bash
javac taxcal.java
```

### 4. Run the Program

```bash
java taxcal
```

## 📤 Sample Output

```text
tax is 0
```

## 📚 Concepts Practiced

This project helps practice:

* Java variables
* Integer data types
* Conditional statements
* Comparison operators
* Arithmetic calculations
* Type casting
* Console output using `System.out.println()`

## 🔮 Future Improvements

Possible improvements include:

* Accept income from the user using `Scanner`.
* Add more income slabs.
* Add input validation.
* Create a menu-based tax calculator.
* Separate tax calculation logic into methods.
* Build a GUI version.

## 👨‍💻 Author

**Varad Takale**

Computer Engineering Graduate | Java Developer Aspirant

---

⭐ If you find this project useful, consider giving the repository a star!





















