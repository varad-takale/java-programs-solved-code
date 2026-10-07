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

# program 6 - 🔢 Largest of Two Numbers in Java

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


# program 8 -  💰 Tax Calculator — Java

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

  # program 9 -  Largest of Three Numbers in Java

## 📌 Description

This project is a simple Java program that finds the **largest number among three given numbers** using `if-else if-else` conditional statements.

The program compares three integer values and prints which variable contains the largest value.

## 🛠️ Technologies Used

* Java
* If-Else Conditional Statements

## ⚙️ How It Works

The program takes three integer values:

```java
int a = 20;
int b = 29;
int c = 15;
```

It then compares the values:

* If `a` is greater than both `b` and `c`, `a` is the largest.
* Otherwise, if `b` is greater than `c`, `b` is the largest.
* Otherwise, `c` is the largest.

## 💻 Example Output

```text
b is largest of 3
```

## ▶️ How to Run

1. Make sure Java is installed on your system.
2. Save the file as:

```text
largest3.java
```

3. Compile the program:

```bash
javac largest3.java
```

4. Run the program:

```bash
java largest3
```

# program 10 - Java Switch Case Program

A simple Java program demonstrating how to use the **switch statement** to execute different blocks of code based on user input.

## 📌 Project Overview

This beginner-friendly Java program takes an integer from the user using the `Scanner` class and checks its value using a `switch` statement.

The program contains:

* **Case 1** → Prints `i am rich`
* **Case 2** → Prints `i am intelligent`
* **Default case** → Prints `you are handsome`

The program uses `Scanner` to read the user's input from the console.

## 🛠️ Technologies Used

* Java
* `Scanner`
* `switch-case`
* Console Input/Output

## 📂 Project Structure

```text
Java-Switch-Case/
│
├── switchcount.java
└── README.md
```

## ⚙️ How It Works

The program first creates a `Scanner` object and reads an integer from the user:

```java
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
```

The entered number is then evaluated using a `switch` statement.

### Case 1

If the user enters `1`:

```text
i am rich
```

### Case 2

If the user enters `2`:

```text
i am intelligent
```

### Default Case

For any other number:

```text
you are handsome
```

The corresponding cases and output statements are present in the uploaded program.

## ▶️ How to Run

### 1. Compile the program

```bash
javac switchcount.java
```

### 2. Run the program

```bash
java switchcount
```

### 3. Enter a number

For example:

```text
1
```

Output:

```text
i am rich
```

## 🧪 Example

### Input

```text
2
```

### Output

```text
i am intelligent
```

If the input is a number other than `1` or `2`, the `default` block executes.


# program 11 -  Java Calculator

A simple **Java Calculator** program that performs basic arithmetic operations using user input and a `switch` statement.

## 🚀 Features

* Addition `+`
* Subtraction `-`
* Multiplication `*`
* Division `/`
* Modulus `%`
* User input using `Scanner`

## 🛠️ Technologies

* Java
* Scanner
* Switch Statement

## 💡 Example

```text
Enter a number: 10
Enter b number: 5
Enter a operator: +

15
```

## ▶️ How to Run

```bash
javac calculator.java
java calculator
```

# program 12 - Java While Loop – Program 12

## 📌 Project Overview

This is a simple Java program demonstrating the use of a **`while` loop**.

The program starts a counter at `0` and repeatedly executes the loop while the counter is less than `100`. During each iteration, it prints `"i am rich"` and increments the counter by `1`. After the loop finishes, it prints `"yes you are rich now"`.

---

## 🛠️ Technologies Used

* Java
* `while` loop
* Variables
* Increment operator (`++`)
* `System.out.println()`

## 📂 Program Structure

```text
Program 12
│
└── wlopp.java
```



## 🔍 How It Works

### 1. Initialize the Counter

```java
int counter = 0;
```

The counter starts with a value of `0`.

### 2. Start the While Loop

```java
while (counter < 100)
```

The loop continues as long as `counter` is less than `100`.

### 3. Print the Message

```java
System.out.println("i am rich");
```

The message is printed during each loop iteration.

### 4. Increment the Counter

```java
counter++;
```

The counter increases by `1` after each iteration.

### 5. Print the Final Message

Once the loop condition becomes false, the program prints:

```text
yes you are rich now
```

---

## 📤 Expected Output

The program prints:

```text
i am rich
i am rich
i am rich
...
```

The message is printed repeatedly while the counter is below `100`.

After the loop completes:

```text
yes you are rich now
```

---

## 🎯 Learning Objective

This program is useful for beginners learning:

* How a `while` loop works
* How loop conditions control repetition
* How variables change during a loop
* How the increment operator works
* How Java executes statements repeatedly

---

## ▶️ How to Run

### Step 1: Install Java

Make sure Java/JDK is installed on your computer.

### Step 2: Compile the Program

```bash
javac wlopp.java
```

### Step 3: Run the Program

```bash
java wlopp
```

---
# program 13 - Java While Loop – Number Printing Program

A simple Java program demonstrating the use of a **while loop** to print numbers from 1 to 10.

## 📌 Overview

This project is a beginner-level Java programming exercise created to practice fundamental programming concepts.

The program:

1. Initializes a counter with the value `1`.
2. Checks whether the counter is less than or equal to `10`.
3. Prints the current counter value.
4. Increments the counter by `1`.
5. Repeats the process until the condition becomes false.

## 🛠️ Technologies Used

* **Java**
* Java `while` loop
* Variables
* Conditional expressions
* Increment operator





## ▶️ Output

```text
1 2 3 4 5 6 7 8 9 10 .
```

## 🧠 Concepts Practiced

* Java class and `main()` method
* Variable declaration and initialization
* `while` loop
* Boolean condition checking
* Increment operator (`++`)
* Console output using `System.out.print()`
* Basic program control flow

## 🎯 Learning Objective

The main objective of this exercise is to understand how a `while` loop works in Java and how a counter can be used to control the number of iterations.

## 📂 Project Structure

```text
Java-While-Loop/
│
├── wloop2.java
└── README.md
```

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/Java-While-Loop.git
```

### 2. Open the project

Open the project in any Java-supported IDE, such as:

* IntelliJ IDEA
* Eclipse
* VS Code
* NetBeans

### 3. Compile the program

```bash
javac wloop2.java
```

### 4. Run the program

```bash
java wloop2
```

# # Program 14 – Print Numbers Using While Loop

## 📌 Description

This Java program takes an integer `n` as input from the user and prints all numbers from **1 to n** using a `while` loop.

The program uses a counter variable starting from `1` and continues printing numbers until the counter becomes greater than `n`.

## 🛠️ Technologies Used

* Java
* Scanner
* While Loop

## ⚙️ How It Works

1. The program takes an integer `n` from the user.
2. A counter is initialized to `1`.
3. The `while` loop runs while `counter <= n`.
4. The current counter value is printed.
5. The counter is increased by `1` after every iteration.
6. A period is printed after the loop finishes.

## 💻 Example

### Input

```text
5
```

### Output

```text
1 2 3 4 5 .
```






# program 15 -  Java Star Pattern Program ⭐

## 📌 Description

This is a simple Java program that demonstrates how to use a **`for` loop** to print a star pattern.

The program prints:

```text
* * * *
* * * *
* * * *
* * * *
```

It uses a loop that runs from **1 to 4**, printing the same star pattern on each iteration.

## 🛠️ Technologies Used

* Java
* `for` loop
* `System.out.println()`

## 📂 Program Structure

```text
Java Star Pattern
│
└── spattern.java
```

## 💻 Code

```java
public class spattern {

    public static void main(String[] args) {

        for(int line = 1; line <= 4; line++) {
            System.out.println("* * * *");
        }

    }
}
```

## ▶️ How to Run

### 1. Compile the program

```bash
javac spattern.java
```

### 2. Run the program

```bash
java spattern
```

## 📤 Output

```text
* * * *
* * * *
* * * *
* * * *
```

# progrram 16 - # 🔄 Reverse Number in Java

A simple Java program to **reverse the digits of a number** using a `while` loop.

## 📌 Program Description

The program takes the number:

```text
17603
```

and reverses its digits to produce:

```text
30671
```

It uses the `%` operator to extract the last digit and integer division `/` to remove the last digit from the original number.

## 🛠️ Technologies Used

* Java
* `while` loop
* Modulus `%` operator
* Integer division `/`
* Variables

## 📂 File

```text
revnumber.java
```

## 💻 Source Code

```java
public class revnumber {

    public static void main(String[] args) {
        int n = 17603;
        int rev = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }

        System.out.println(rev);
    }
}
```

## ▶️ Output

```text
30671
```

## 🧠 How It Works

For `17603`:

| Step | Last Digit | Reverse |
| ---- | ---------: | ------: |
| 1    |          3 |       3 |
| 2    |          0 |      30 |
| 3    |          6 |     306 |
| 4    |          7 |    3067 |
| 5    |          1 |   30671 |

### Logic

```text
lastdigit = n % 10
rev = (rev * 10) + lastdigit
n = n / 10
```

The loop continues until `n` becomes `0`.

## ▶️ How to Run

Compile:

```bash
javac revnumber.java
```

Run:

```bash
java revnumber
```


#  Program 18 - Do While Loop in Java

## 📌 Description

This Java program demonstrates the use of a **`do-while` loop**.

The program starts a counter at `1` and prints **"hello world"** repeatedly. The counter is incremented after each print, and the loop continues while the counter is less than or equal to `10`.

## 💻 Source Code

```java
public class dowhile {

    public static void main(String[] args) {
        int counter = 1;

        do {
            System.out.println("hello world");
            counter++;
        }
        while (counter <= 10);
    }
}
```

## 🧠 Concept Used

### Do-While Loop

A `do-while` loop executes the block of code **at least once** before checking the condition.

### Syntax

```java
do {
    // statements
} while (condition);
```

## 🔄 How It Works

1. The variable `counter` is initialized to `1`.
2. The `do` block prints `"hello world"`.
3. The counter is increased by `1`.
4. The condition `counter <= 10` is checked.
5. The loop continues until the condition becomes false.

## 📤 Output

```text
hello world
hello world
hello world
hello world
hello world
hello world
hello world
hello world
hello world
hello world
```

## 🛠️ Technologies Used

* Java
* Do-While Loop
* `System.out.println()`


# Program 19 – Do-While Loop

## 📌 Description

This Java program demonstrates the use of a **`do-while` loop** and the **`break` statement**.

The program continuously accepts numbers from the user and prints them. When the user enters a number that is a **multiple of 10**, the loop stops and an error message is displayed.

## 🛠️ Concepts Used

* Java
* `Scanner` class
* `do-while` loop
* `if` statement
* Modulus (`%`) operator
* `break` statement
* User input

## ⚙️ How It Works

1. The program asks the user to enter a number.
2. It checks whether the number is divisible by 10.
3. If it is **not** a multiple of 10, the number is printed.
4. If it **is** a multiple of 10, the `break` statement terminates the loop.
5. An error message is then displayed.

## 💻 Example

### Input

```text
enter the number : 5
5
enter the number : 12
12
enter the number : 27
27
enter the number : 30
```

### Output

```text
error : multiple of 10
```

# Program 20 – Multiplication Table

## 📌 Description

This Java program demonstrates how to create a **multiplication table from 1 to 10** using a `for` loop.

The program takes a number as input from the user and prints its multiplication table.

## 🛠️ Concepts Used

* Java
* `Scanner` class
* `for` loop
* Methods
* User input
* Multiplication operator (`*`)
* `System.out.println()`

## 💻 Program

```java
import java.util.*;

class MultiplicationTable {

    public static void printMultiplicationTable(int number) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String s[]) {
        printMultiplicationTable(5);
    }
}
```

## ▶️ Example Output

```text
Enter number: 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
```

## 🎯 Learning Objective

The main objective of this program is to practice:

1. Creating and calling methods.
2. Taking input using `Scanner`.
3. Using a `for` loop.
4. Performing arithmetic operations.
5. Printing formatted output in Java.

## 📂 File Name

`program 20 - Solution.java`

## 👨‍💻 Author

**Varad Takale**































