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

## 📂 Project Structure

```text
Adult-Age-Checker/
│
├── adult.java
└── README.md
```

## 🎯 Learning Objective

The main objective of this project is to understand how **conditional statements (`if-else`)** work in Java and how they can be used to make decisions based on a given condition.

## 👨‍💻 Author

**Varad Takale**

---

⭐ If you found this project useful, feel free to star the repository!











