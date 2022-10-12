# AgileTesting

This project contains code for the first Agile practical on CS31310. On Blackboard,
you will find additional notes about this practical. This document outlines the 
requirements that the code has implemented.

Read this document and the document on Bb before working with the code.

## About the code 

The code at the start of this practical contains the following items, which are all in the packages 
`agile` or `agile.tests`, in the `src` directory. 

* **Greeting.java** - The class that has the code to be tested. It implements a set of requirements about how to provide a greeting. The requirements are discussed below.
* **CharacterStyle.java** - An enumeration of values for Upper and Lower case. No changes are needed to this code.
* **Main.java** - A simple main method. This shows the basic setup to run the greeting class.  
* **GreetingTest.java** - An example test class, which has one example test in it. Use this as an inspiration to start your own test class during this practical.

## About this practical 

The practical is about designing test cases for the code in the `Greeting` class. You will write those test cases as tests using JUnit. You will write those tests in the class `GreetingTest`.

The `Greeting` class has two main methods that you need to test:

* **greet** - This takes an array of Strings and produces a greeting, according to some rules. The rules are described below.
* **checkCharacters** - This checks if all of the characters in a string are upper or lower case. 

There is also a constructor, which takes two parameters. The first is the text that starts all greetings created by the method. The second is a default name to use if no names are provided to the `greet` method. 

## Requirements for the code

The `greet` method produces a greeting that meets the following requirements. Where an array is mentioned, it refers to the array of names passed to the method as a parameter.

* If the provided value is `null`, instead of an array of Strings, the greeting should use the default name. An example result is `Hello, friend!`. 
* If there is one element in the array, the greeting will be `Hello, name`, where name is the value in the array.
    * If the name is all in upper case characters or all in lower case characters, the start of the message is changed to match. For example, if the name is `ADA`, then the greeting will be `HELLO, ADA`.
* If there are several elements in the array, the greeting will be like `Hello, name1, name2 and name3`. There will be a comma between name and the word `and` used instead of a comma for the final name.
    * If any of the names in the array are all in upper case, then they will be moved to the end for a separate greeting in upper case. For example, if the names are `Ada`, `ALAN` and `Grace`, the example message would be `Hello, Ada and Grace. AND HELLO, ALAN.  
    * Expanding the last requirement, if there are multiple names in upper case, the upper case names will all appear in the separate greeting at the end, separated by commas. No `AND` is used before the final name of this separate greeting. For example, if the input names are `Ada`, `ALAN` and `GRACE`, then the greeting would be `Hello, Ada. AND HELLO, ALAN, GRACE.`.

The `checkCharacters` method takes two parameters. It checks each character in the string. If all characters match the specified CharacterStyle (Upper or Lower case), then `true` is returned. If at least one character does not match the CharacterStyle, then `false` is returned. 

**Note:** the `checkCharacters` method could be private to the class because it is really there to support the code in the `greet` method. For the purposes of this exercise, it has been made public so that you can write tests for it.

## About the tests

The `ExampleGreetingTest` class contains an example JUnit test. 

Remember that each test method needs to have the @Test annotation before it. 

For this exercise, the assertions `assertEquals()`, `assertTrue()` and `assertFalse()` will be sufficient.

## About this code

This code is not intended to use advanced concepts. It uses conditions (with if statements) and 
iteration (for loops). There are some other features of Java that could simplify parts of the code. 
However, this isn't an exercise in using more recent Java. The code is designed so that it should be 
readable by everyone on the module, even if they have not programmed with Java recently.

## Authors and acknowledgment

Created by Neil Taylor. The idea for the exercise is based on an [exercise for learning Test-Driven Development](https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata), by Jake Van Alstyne. The idea has been adjusted for this practical and it does not use TDD. We are using the idea of a Greeting generator as the basis for code that we can test.

## License

The MIT License applies to this project.

## Project status

This has been written for students taking the module in 2022-23.