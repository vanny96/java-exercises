# java-exercises

I'm solving some exercises inspired from the MOOC from the University of Helsinki's java course. Some of them will recall closely the ones that the exercises the course asks for, while others will have little in common with the original exercise.

In solving this exercises I'm using JDK 11.0.3, Maven 3.6.0 (in order to get used to it once I'll learn to build bigger projects) and VS Code as an IDE (planning to switch to NetBeans or Intellij in a couple of weeks).

To run an App navigate to its target/classes folder then run java com.vanny96.App

e.g. for linux:

    $ cd java-exercises
    $ cd name/target/classes
    $ java com.vanny96.App



## Exercises

* Name: this app displays my full name (learned to print on the terminal)
* Calculator: this app asks for 2 numbers and then for a method (one from sum, difference, multiplication, division), it will then display the result of the operation. (Used reflection to invoke the method instead of relying on conditional statements)
* Hangman: this app is a simple iteration of the popular game "Hangman", it chooses a random word from a text file (using BufferedReader) and then let's you guess it in 6 attempts.
* Clock: this app takes the initial time and how much time do you want to wait, it then display the seconds, minutes and hours while they pass. (MOOC exercise 78)
* Lyria-Card: this exercise let me practice in creating different classes and objects, while simulating the behaviour of payment cards and chash registers. (MOOC exercise 86)
* Teams: this exercises let me practice in obgject oriented programming by creating different classes and objects tha interacted between them. (MOOC exercise 90)
* Birdwatcher: this app let's you enter data about birds observed. (MOOC exercise 103)
  * add - let's you add a new bird
  * observation - let's you notify the database that you saw a bird again
  * statistics - prints all the collected data 
  * show - prints the collected data of a bird of your choice
  * quit - closes the app