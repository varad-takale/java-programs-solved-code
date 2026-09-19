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

# program 7 - # 🤗 Hugging Face Pipelines Demo

A simple Python project demonstrating the initial setup for working with **Hugging Face Transformers Pipelines**.

## 📌 About the Project

This project is created to explore and demonstrate the use of the **Hugging Face Transformers** library and its `pipeline()` API for working with pre-trained machine learning models.

The notebook currently focuses on installing the required library and importing the tools needed for working with:

* Hugging Face Transformers
* Image processing
* HTTP requests
* Data visualization

## 🛠️ Technologies Used

* **Python**
* **Hugging Face Transformers**
* **Pillow (PIL)**
* **Requests**
* **Matplotlib**
* **Google Colab / Jupyter Notebook**

## 📦 Libraries Used

```python
!pip install transformers

import requests
from io import BytesIO
from transformers import pipeline
from PIL import Image, ImageDraw
import matplotlib.pyplot as plt
```

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/hugging-face-pipelines-demo.git
cd hugging-face-pipelines-demo
```

### 2. Install Dependencies

Install the Transformers library:

```bash
pip install transformers
```

You may also install the supporting libraries:

```bash
pip install requests pillow matplotlib
```

### 3. Run the Notebook

Open the notebook using Jupyter:

```bash
jupyter notebook
```

Or open it directly in **Google Colab**.

## 📂 Project Structure

```text
hugging-face-pipelines-demo/
│
├── project 11.ipynb
└── README.md
```

## 🎯 Purpose

The purpose of this project is to build familiarity with the Hugging Face Transformers ecosystem and understand how the `pipeline()` interface can be used as a starting point for working with pre-trained machine learning models.

## 🔮 Future Scope

The project can be extended by implementing different Hugging Face pipelines, such as:

* Text classification
* Sentiment analysis
* Text generation
* Image classification
* Object detection
* Question answering
* Summarization
* Named Entity Recognition (NER)

## 👨‍💻 Author

**Varad Takale**

Computer Engineering Graduate

### Skills & Interests

`Java` • `Python` • `SQL` • `Machine Learning` • `AI` • `Spring Boot`

---

⭐ If you find this project useful, consider giving the repository a star!

















