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

## 📄 Source Code

```java
public class addition {

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);
    }
}
```

## ▶️ Output

```text
25
```
# program 3 - # Circle Area Calculator in Java

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





